package edu.project1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleDictionaryTest {

    @Test
    void randomWordShouldReturnAWordFromTheList() {
        SimpleDictionary dictionary = new SimpleDictionary();
        String word = dictionary.randomWord();
        assertTrue(word.matches("hello|world|java|hangman"));
    }
}

class SessionTest {

    @Test
    void guessingCorrectLetterShouldReturnSuccessfulGuess() {
        Session session = new Session("hello");
        GuessResult result = session.guess('h');
        assertTrue(result instanceof GuessResult.SuccessfulGuess);
    }

    @Test
    void guessingIncorrectLetterShouldReturnFailedGuess() {
        Session session = new Session("hello");
        GuessResult result = session.guess('z');
        assertTrue(result instanceof GuessResult.FailedGuess);
    }

    @Test
    void givingUpShouldReturnDefeat() {
        Session session = new Session("hello");
        GuessResult result = session.giveUp();
        assertTrue(result instanceof GuessResult.Defeat);
    }
}
