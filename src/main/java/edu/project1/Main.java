package edu.project1;

import java.util.Random;
import java.util.Scanner;
import org.jetbrains.annotations.NotNull;

interface Dictionary {
    @NotNull String randomWord();
}

class SimpleDictionary implements Dictionary {
    private final String[] words = {"hello", "world", "java", "hangman"};

    @Override
    public @NotNull String randomWord() {
        Random random = new Random();
        return words[random.nextInt(words.length)];
    }
}

class Session {
    private final String answer;
    private final char[] userAnswer;
    private final int maxAttempts = 5;
    private int attempts = 0;

    public Session(@NotNull String answer) {
        this.answer = answer;
        this.userAnswer = new char[answer.length()];
        for (int i = 0; i < answer.length(); i++) {
            userAnswer[i] = '*';
        }
    }

    @NotNull
    public GuessResult guess(char guess) {
        boolean hit = false;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == guess) {
                userAnswer[i] = guess;
                hit = true;
            }
        }

        if (hit) {
            if (new String(userAnswer).equals(answer)) {
                return new GuessResult.Win(userAnswer, attempts, maxAttempts, "You won!");
            }
            return new GuessResult.SuccessfulGuess(userAnswer, attempts, maxAttempts, "Hit!");
        } else {
            attempts++;
            if (attempts >= maxAttempts) {
                return new GuessResult.Defeat(userAnswer, attempts, maxAttempts, "You lost!");
            }
            return new GuessResult.FailedGuess(
                userAnswer,
                attempts,
                maxAttempts,
                "Missed, mistake " + attempts + " out of " + maxAttempts + "."
            );
        }
    }

    @NotNull
    public GuessResult giveUp() {
        return new GuessResult.Defeat(userAnswer, attempts, maxAttempts, "You gave up!");
    }
}

sealed interface GuessResult {
    char[] state();

    @NotNull String message();

    record Defeat(char[] state, int attempt, int maxAttempts, String message) implements GuessResult {
    }

    record Win(char[] state, int attempt, int maxAttempts, String message) implements GuessResult {
    }

    record SuccessfulGuess(char[] state, int attempt, int maxAttempts, String message) implements GuessResult {
    }

    record FailedGuess(char[] state, int attempt, int maxAttempts, String message) implements GuessResult {
    }
}

class ConsoleHangman {
    private final Dictionary dictionary;

    public ConsoleHangman(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Session session = new Session(dictionary.randomWord());
        while (true) {
            System.out.println("Guess a letter:");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                System.out.println(input);
                GuessResult result = session.giveUp();
                printState(result);
                break;
            }
            if (input.length() != 1) {
                System.out.println("Please enter only one letter.");
                continue;
            }
            GuessResult result = session.guess(input.charAt(0));
            printState(result);
            if (result instanceof GuessResult.Win || result instanceof GuessResult.Defeat) {
                break;
            }
        }
    }

    private void printState(@NotNull GuessResult guess) {
        System.out.println(guess.message());
        System.out.println("The word: " + new String(guess.state()));
    }

    public static void main(String[] args) {
        ConsoleHangman game = new ConsoleHangman(new SimpleDictionary());
        game.run();
    }
}
