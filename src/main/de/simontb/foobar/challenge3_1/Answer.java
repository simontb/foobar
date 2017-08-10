package de.simontb.foobar.challenge3_1;

public class Answer {

    public static int answer(int n) {
        int[][] result = new int[n + 1][n + 1];
        result[1][1] = 1;
        int firstRelevantColumn = 1;
        int occurrencesOfFirstRelevantColumnAsFirstOne = 0;
        for (int row = 2; row <= n; row++) {
            double halfOfRow = row / 2.0;
            if (++occurrencesOfFirstRelevantColumnAsFirstOne > firstRelevantColumn) {
                firstRelevantColumn++;
                occurrencesOfFirstRelevantColumnAsFirstOne = 0;
            }
            for (int column = firstRelevantColumn; column <= row; column++) {
                if (column == row) result[row][column] = 1 + result[row][column - 1];
                else if (column > halfOfRow) result[row][column] = result[row - column][row - column] + result[row][column - 1];
                else if (column < halfOfRow) result[row][column] = result[row - column][column - 1] + result[row][column - 1];
                else if (column == halfOfRow) result[row][column] = result[column][column - 1] + result[row][column - 1];
            }
        }
        return result[n][n] - 1;
    }

    public static int answerRecursive(int n) {
        return getNumberOfStaircases(n, n - 1);
    }

    private static int getNumberOfStaircases(int numberOfBricks, int maxHeight) {
        int numberOfStaircases = 0;
        for (int i = maxHeight; i > 0; i--) {
            int remainingBricks = numberOfBricks - i;
            if (remainingBricks > 0) {
                int numberOfRightStaircases = getNumberOfStaircases(remainingBricks, i - 1);
                if (0 == numberOfRightStaircases) break;
                numberOfStaircases += numberOfRightStaircases;
            }
            if (0 == remainingBricks) numberOfStaircases++;
        }
        return numberOfStaircases;
    }

}
