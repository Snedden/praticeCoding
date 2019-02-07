package leetCode.InterviewQuestions.uniPath;

public class Tester {
  public static void main(String[] args){

    TreeNode n = new TreeNode(5);
    n.left = new TreeNode(4);
    n.right = new TreeNode(5);
    n.left.left = new TreeNode(1);
    n.left.right = new TreeNode(1);
    n.right.right = new TreeNode(5);

    int max = TheirSolution.longestUnivaluePath(n);

    System.out.print(max);
  }
}
