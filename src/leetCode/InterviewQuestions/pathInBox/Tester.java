package leetCode.InterviewQuestions.pathInBox;

public class Tester {

  public static void main(String[] args){
    int m = 3;
    int n = 2;
    PathsInBox p = new PathsInBox();
    int paths = DpBox.uniquePaths(m,n);
    System.out.println(paths);
  }
}
