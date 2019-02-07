package leetCode.InterviewQuestions.islands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Islands {

  public static int numIslands(char[][] grid){

    int islands = 0;
    for(int i=0; i< grid.length; i++){
      for(int j=0; j < grid[i].length; j++){
        if(grid[i][j] == '1'){
          islands++;
          dfsIslands(grid,i, j);
        }

      }
    }
    return islands;
  }

  private static void dfsIslands(char[][] grid, int i, int j) {
    if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
      grid[i][j] = '0';
      dfsIslands(grid, i + 1, j);
      dfsIslands(grid, i - 1, j);
      dfsIslands(grid, i, j + 1);
      dfsIslands(grid, i, j - 1);
    }
  }
}
