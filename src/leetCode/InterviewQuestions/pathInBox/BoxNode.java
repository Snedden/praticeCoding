package leetCode.InterviewQuestions.pathInBox;

public class BoxNode {
  int m;
  int  n;
  boolean visited;
  BoxNode left;
  BoxNode right;
  BoxNode top;
  BoxNode bottom;

  public BoxNode(int i, int j){
    m = i;
    n = j;
    visited = false;
  }
}
