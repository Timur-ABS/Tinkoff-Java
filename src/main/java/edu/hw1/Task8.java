package edu.hw1;

public final class Task8 {
    private static final int BOARD_SIZE = 8;
    private static final int[][] MOVES = {
        {1, 2}, {1, -2}, {-1, 2}, {-1, -2},
        {2, 1}, {2, -1}, {-2, 1}, {-2, -1}
    };

    public static boolean knightBoardCapture(int[][] desk) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (desk[row][column] == 1 && hasKnightNeighbor(desk, row, column)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasKnightNeighbor(int[][] desk, int row, int column) {
        for (int[] move : MOVES) {
            int newRow = row + move[0];
            int newColumn = column + move[1];
            if (inDesk(newRow, newColumn) && desk[newRow][newColumn] == 1) {
                return true;
            }
        }
        return false;
    }

    private static boolean inDesk(int row, int column) {
        return (row >= 0 && column >= 0 && row < BOARD_SIZE && column < BOARD_SIZE);
    }
}
