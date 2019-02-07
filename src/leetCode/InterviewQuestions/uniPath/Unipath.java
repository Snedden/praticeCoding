package leetCode.InterviewQuestions.uniPath;

public class Unipath {


    static int max = 0, curmax = 0;
    public static  int longestUnivaluePath(TreeNode root) {
      return DfsTree(root, root );
    }

    private static int DfsTree(TreeNode n , TreeNode prev){
      if(n!= null && (n.left != null || n.right != null)){
        if(n.left != null){
          if(n.left.val == prev.val){
            curmax = curmax+1;
            if(curmax > max){
              max = curmax;
            }
          }else{
            curmax = 0;
            prev = prev.left;
          }
          DfsTree(n.left, prev);
          }
        if(n.right != null){
          if(prev.val != n.val){
            curmax = 0;
            prev = n;
          }

          if(n.right.val == prev.val){
            curmax = curmax+1;
            if(curmax > max){
              max = curmax;
            }
          }
          else{
            curmax = 0;
            prev = prev.right;
          }
          DfsTree(n.right, prev);
        }

      }
      return max;
    }



}

