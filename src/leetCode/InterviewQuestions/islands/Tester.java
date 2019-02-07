package leetCode.InterviewQuestions.islands;

public class Tester {
  static char[][] grid ={
      {'1','1','0','0','0'},
      {'1','1','0','0','0'},
      {'0','0','1','0','0'},
      {'0','0','0','1','1'}
  };

  public static void main(String[] args){
    int islands = Islands.numIslands(grid);
    System.out.println("Islands "+ islands);
  }

}
