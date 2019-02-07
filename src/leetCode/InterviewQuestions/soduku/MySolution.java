package leetCode.InterviewQuestions.soduku;

import java.util.HashSet;
import java.util.Set;

public class MySolution {
  public static  boolean isValid(char[][] board){
    Set<String> seen = new HashSet<>();

    for(int i=0;i< board.length; i++){
      for(int j=0; j<board[i].length; j++){
        char number = board[i][j];
        if(number != '.'){
          if( !(seen.add(number+" at row "+i))||
              !(seen.add(number+" at col "+j))||
              !(seen.add(number+" at box "+i/3+","+j/3))){
            return false;
          }
        }
      }
    }
    return true;
  }

}

/*
[
[".",".","4",".",".",".","6","3","."],
[".",".",".",".",".",".",".",".","."],
["5",".",".",".",".",".",".","9","."],
[".",".",".","5","6",".",".",".","."],
["4",".","3",".",".",".",".",".","1"],
[".",".",".","7",".",".",".",".","."],
[".",".",".","5",".",".",".",".","."],
[".",".",".",".",".",".",".",".","."],
[".",".",".",".",".",".",".",".","."]]
 */
