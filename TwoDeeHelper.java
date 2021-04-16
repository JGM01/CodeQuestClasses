import java.util.Scanner;

/**
 * Class containing methods to help with 2D arrays
 */
public class TwoDeeHelper {
    private TwoDeeHelper() {
    }

    /**
     * Creates a new 2D array from a {@link java.util.Scanner Scanner} of size X by
     * Y.
     * 
     * @param sc         the {@link java.util.Scanner Scanner} that will input the
     *                   array
     * @param boardSizeX length of board in X direction
     * @param boardSizeY length of board in Y direction
     * @return a new 2D array
     */
    public static char[][] readBoard(Scanner sc, int boardSizeX, int boardSizeY) {
        char[][] board = new char[boardSizeX][boardSizeY];
        for (int y = 0; y < boardSizeY; y++) {
            String line = sc.nextLine();
            for (int x = 0; x < boardSizeX; x++) {
                board[x][y] = line.charAt(x);
            }
        }
        return board;
    }

    /**
     * Prints a 2D array to the console.
     * 
     * @param board the 2D array to print
     */
    public static void printBoard(char[][] board) {
        System.out.println();
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }

    /**
     * Helper method that will return how many adjacent things are to a location
     * 
     * @param board      the board being tested
     * @param x          the x location being tested
     * @param y          the y location being testd
     * @param flag       the thing that you are looking to detect
     * @param boardSizeX the size of the board in the X direction. This prevents
     *                   IndexOutOfBounds exceptions.
     * @param boardSizeY the size of the board in the Y direction. This prevents
     *                   IndexOutOfBounds exceptions.
     * @return the number of adjacent flag cells.
     */
    public static int adjacent(char[][] board, int x, int y, int flag, int boardSizeX, int boardSizeY) {
        int numAdj = 0;
        for (int y2 = y - 1; y2 < y + 2; y2++)
            for (int x2 = x - 1; x2 < x + 2; x2++)
                if (x2 > -1 && x2 < boardSizeX && y2 > -1 && y2 < boardSizeY && !(x2 == x && y2 == y))
                    if (board[x2][y2] == flag)
                        numAdj++;
        return numAdj;
    }

    /**
     * 
     * Will return how many adjacent things are to a location but it will <b>not</b>
     * count the cardinal directions.
     * 
     * @param board      the board being tested
     * @param x          the x location being tested
     * @param y          the y location being testd
     * @param flag       the thing that you are looking to detect
     * @param boardSizeX the size of the board in the X direction. This prevents
     *                   IndexOutOfBounds exceptions.
     * @param boardSizeY the size of the board in the Y direction. This prevents
     *                   IndexOutOfBounds exceptions.
     * @return the number of adjacent flag cells.
     */
    public static int adjacentCorners(char[][] board, int x, int y, int flag, int boardSizeX, int boardSizeY) {
        int numAdj = 0;
        for (int y2 = y - 1; y2 < y + 2; y2 += 2)
            for (int x2 = x - 1; x2 < x + 2; x2 += 2)
                if (x2 > -1 && x2 < boardSizeX && y2 > -1 && y2 < boardSizeY && !(x2 == x && y2 == y))
                    if (board[x2][y2] == flag)
                        numAdj++;

        return numAdj;
    }

    /*
     * TODO: actually impliment this public static int adjacentCardinal(char[][]
     * board, int x, int y, int flag, int boardSizeX, int boardSizeY) { int numAdj =
     * 0; for (int y2 = y - 1; y2 < y + 2; y2++) for (int x2 = x; x2 < x + 2; x2 %=
     * 2) if (x2 > -1 && x2 < boardSizeX && y2 > -1 && y2 < boardSizeY && !(x2 == x
     * && y2 == y)) if (board[x2][y2] == flag) numAdj++;
     * 
     * return numAdj;
     * 
     * }
     */

}