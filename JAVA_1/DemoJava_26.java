import java.util.*;
public class DemoJava_26 {
    public boolean isSafe(char[][]board, int row, int col){
        //horizontal
        for(int j = 0; j < board.length; j++){
            if(board[row][j] == '0'){
                return false;
            }
        }
      //  vertical
      for(int i = 0; i < board.length; i++){
        if(board[i][col] == '0'){
            return false;
        }
      }
      //left upper
      int r = row;
      for(int j = col; j >= 0 && r >= 0; j--, r--){
        if(board[r][j] == '0'){
            return false;
        }
      }
      //left lower
      int r = row;
      for(int j = col; j >= 0 && r < board.length; j--, r++){
        if(board[r][j] == '0'){
            return false;

    }
    
}
