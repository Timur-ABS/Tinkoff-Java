package edu.hw2.Task3;

public class StableConnection implements Connection {
    @Override
    public void execute(String command) {
        System.out.println("Executing: " + command);
    }

    @Override
    public void close() {
        System.out.println("Stable connection closed");
    }
}
