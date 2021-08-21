import java.util.HashSet;

public class SUDOKU {
    int len = 0;
    char[][] sol;

    public void solveSudoku(char[][] board) {
        len = board.length;
        traverse(board, 0, 0);

    }

    public boolean traverse(char[][] board, int row, int col) {
        if (row == len && col == len) {
            sol = board;
            return true;
        } else {
            HashSet<Character> l = new HashSet<>();
            for (int i2 = 1; i2 < 10; i2++) {
                l.add((char) (i2 + '0'));
            }
            for (int i = row; i < len; i++) {
                for (int j = col; j < len; j++) {
                    if (board[i][j] == '.') {
                        for (char c : l) {
                            if (isValid(board, i, j, c)) {
                                board[i][j] = c;
                                if (traverse(board, i, j)) {

                                    if (i + 1 == len && j + 1 == len)
                                        this.sol = board;
                                    return true;
                                } else {
                                    board[i][j] = '.';
                                }
                            }
                        }

                    } else {
                        l.remove(board[i][j]);
                    }
                }
            }
            return false;
        }
    }

    public boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.' && board[i][col] == c) return false;
            if (board[row][i] != '.' && board[row][i] == c) return false;
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }


}
