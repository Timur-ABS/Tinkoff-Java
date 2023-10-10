package edu.hw1;

public final class Task8 {
    public static boolean knightBoardCapture(int[][] desk) {
        int[][] moves = {{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1},};
        for (int line = 0; line < 8; line++) {
            for (int column = 0; column < 8; column++) {
                if (desk[line][column] == 1) {
                    for (int i = 0; i < 8; i++) {
                        int curLine = line + moves[i][0], curColumn = column + moves[i][1];
                        if (inDesk(curLine, curColumn)) {
                            if (desk[curLine][curColumn] == 1) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean inDesk(int line, int column) {
        return (line >= 0 && column >= 0 && line < 8 && column < 8);
    }
}
