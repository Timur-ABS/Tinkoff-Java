package edu.hw2;

import edu.hw2.Task3.Connection;
import edu.hw2.Task3.ConnectionException;
import edu.hw2.Task3.ConnectionManager;
import edu.hw2.Task3.DefaultConnectionManager;
import edu.hw2.Task3.FaultyConnectionManager;
import edu.hw2.Task3.PopularCommandExecutor;
import edu.hw2.Task3.StableConnection;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task3Test {

    @Test
    public void testStableConnection() {
        ConnectionManager manager = new DefaultConnectionManager() {
            @Override
            public Connection getConnection() {
                return new StableConnection();
            }
        };
        PopularCommandExecutor executor = new PopularCommandExecutor(manager, 3);
        assertDoesNotThrow(executor::updatePackages);
    }

    @Test
    public void testFaultyConnection() {
        ConnectionManager manager = new FaultyConnectionManager();
        PopularCommandExecutor executor = new PopularCommandExecutor(manager, 3);

        assertThrows(ConnectionException.class, executor::updatePackages);
    }

    @Test
    public void testMaxAttempts() {
        ConnectionManager manager = new FaultyConnectionManager();
        PopularCommandExecutor executor = new PopularCommandExecutor(manager, 3);

        int count = 0;
        try {
            executor.updatePackages();
        } catch (ConnectionException e) {
            count = e.getMessage().split("Failed after ")[1].charAt(0) - '0';
        }

        assertEquals(3, count);
    }

    @Test
    public void testSuppressedException() {
        ConnectionManager manager = new FaultyConnectionManager();
        PopularCommandExecutor executor = new PopularCommandExecutor(manager, 3);

        ConnectionException thrownException = assertThrows(ConnectionException.class, executor::updatePackages);
        assertTrue(thrownException.getCause() instanceof ConnectionException);
    }
}
