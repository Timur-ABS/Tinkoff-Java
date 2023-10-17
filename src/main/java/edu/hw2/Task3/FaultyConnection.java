package edu.hw2.Task3;

public class FaultyConnection implements Connection {
    @Override
    public void execute(String command) {
        throw new ConnectionException("Faulty connection error");
    }

    @Override
    public void close() {
        System.out.println("Faulty connection closed");
    }
}
