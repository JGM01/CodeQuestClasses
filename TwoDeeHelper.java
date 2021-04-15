public class TwoDeeHelper {
    private TwoDeeHelper() {
    }

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