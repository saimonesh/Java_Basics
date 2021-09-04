import java.util.Arrays;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(driver(board,word,i,j,0))
                    return true;
            }
        }
        return false;
    }

    public boolean driver(char[][] board, String word, int i, int j, int index) {
        if (index == word.length())
            return true;
        else if (i < 0 || i >= board.length || j < 0 || j >= board[i].length)
            return false;
        else {
            if (board[i][j] == word.charAt(index)) {
                char temp=board[i][j];
                board[i][j] = '1';
                index += 1;
                if( driver(board, word, i - 1, j, index) || driver(board, word, i + 1, j, index) || driver(board, word, i, j + 1, index) || driver(board, word, i, j - 1, index))
                {
                    return true;
                }else
                {
                    board[i][j]=temp;
                }
            }
            return false;
        }
    }


}
