package UdemyCSDojoCourse.MS2;

import java.util.*;

public class MS2 {
  public static void main(String[] args) {
    // NOTE: The following input values will be used for testing your solution.
    int[][] field1 = {{0, 0, 0, 0, 0},
        {0, 1, 1, 1, 0},
        {0, 1, -1, 1, 0}};

    // click(field1, 3, 5, 2, 2) should return:
    // [[0, 0, 0, 0, 0],
    //  [0, 1, 1, 1, 0],
    //  [0, 1, -1, 1, 0]]

    // click(field1, 3, 5, 1, 4) should return:
    // [[-2, -2, -2, -2, -2],
    //  [-2, 1, 1, 1, -2],
    //  [-2, 1, -1, 1, -2]]


    int[][] field2 = {{-1, 1, 0, 0},
        {1, 1, 0, 0},
        {0, 0, 1, 1},
        {0, 0, 1, -1}};

    // click(field2, 4, 4, 0, 1) should return:
    // [[-1, 1, 0, 0],
    //  [1, 1, 0, 0],
    //  [0, 0, 1, 1],
    //  [0, 0, 1, -1]]

    // click(field2, 4, 4, 1, 3) should return:
    // [[-1, 1, -2, -2],
    //  [1, 1, -2, -2],
    //  [-2, -2, 1, 1],
    //  [-2, -2, 1, -1]]
  }

  // Implement your solution below.
  public static int[][] click(int[][] field, int numRows, int numCols, int givenI, int givenJ) {


    clickHelper(field, numRows, numCols, givenI, givenJ);
    return field;
  }

  public static void clickHelper(int[][] field, int rows, int cols,int x, int y){
    //revel only empty elements
    if(field[x][y] == 0)
      field[x][y] = -2;
    else{
      return;
    }

    ArrayList<Block> neigh = getNeigh(x, y, rows, cols);

    for(Block b:neigh){
      if(b.value == 0){
        clickHelper(field, rows, cols, b.xPos, b.yPos);
      }

    }

  }

  public static ArrayList<Block> getNeigh(int x,int y, int rows, int cols){
    ArrayList<Block> neigh = new ArrayList<>();

    for(int k = x - 1; k <=  x + 1; k++){
      for(int m = y -1; m <= y + 1; m++ ){
        if(( k > -1 && m > -1) && (k < rows && m < cols) && !(k == x && m == y)) {
          neigh.add(new Block(k,m));
        }
      }
    }
    return neigh;
  }

  public static void revealBlocks(int[][] field, ArrayList<Block> toReveal){
    for(Block b:toReveal){
      field[b.xPos][b.yPos] = -2;// -2 == revealed
    }
  }

  static class  Block{
    int xPos;
    int yPos;
    int value;
    boolean isRevealled;
    boolean isBomb;
    //good to have isBomb, isRevealed

    public Block(int x, int y){
      this.xPos = x;
      this.yPos = y;
      this.value = 0;
      this.isRevealled = false;
    }

    public void revealBlock(){
      if(this.value == 0){
        this.value = -2;
      }

      this.isRevealled = true;
    }
  }


}
