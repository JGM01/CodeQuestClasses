public class TwoDeeHelper {
    private TwoDeeHelper() {
    }

    /**
     *  Helper method that will return how many adjacent things are to a location
     * @param board the board being tested
     * @param x the x location being tested
     * @param y the y location being testd
     * @param flag the thing that you are looking to detect
     * @param boardSizeX the size of the board in the X direction. This prevents IndexOutOfBounds exceptions.
     * @param boardSizeY the size of the board in the Y direction. This prevents IndexOutOfBounds exceptions.
     * @return the number of adjacent flag cells.
     */
    public static int adjacent(int[][] board, int x, int y, int flag, int boardSizeX, int boardSizeY) {
        int numAdj = 0;
        for (int y2 = y - 1; y2 < y + 2; y2++) {
            for (int x2 = x - 1; x2 < x + 2; x2++) {
                if (x2 > -1 && x2 < boardSizeX && y2 > -1 && y2 < boardSizeY && !(x2 == x && y2 == y)) {
                    if (board[x2][y2] == flag) {
                        numAdj++;
                    }
                }
            }
        }
        return numAdj;
    }
}