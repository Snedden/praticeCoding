package leetCode.InterviewQuestions.uniPath;

public class TheirSolution {
  static int ans;

  public static  int longestUnivaluePath(TreeNode root){
    ans =0 ;
    helper(root);
    return ans;
  }

  private static int helper(TreeNode root){
    if(root != null){
      int maxLeft = 0;
      int maxRight = 0;

      int left = helper(root.left);
      int right = helper(root.right);

      if(root.left != null && root.left.val == root.val){
        maxLeft = 1 + left;
      }

      if(root.right != null && root.right.val == root.val){
        maxRight = 1 + right;
      }

      ans = Math.max(ans, maxLeft + maxRight);
      return Math.max(maxLeft, maxRight);
    }
    return 0;
  }


}
