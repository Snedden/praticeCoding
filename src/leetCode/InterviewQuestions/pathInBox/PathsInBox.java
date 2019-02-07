package leetCode.InterviewQuestions.pathInBox;

public class PathsInBox {
  Integer paths = 0;
  public  int uniquePaths(int m, int n) {

    BoxNode root = new BoxNode(0,0);
    helper(root,m,n);

    return paths;
  }

  private  void helper(BoxNode root,int m, int n){
    root.visited = true;
    if(root.m == m && root.n == n){
      paths = paths +1;
    }
    if(root.m<0 || root.n<0 || root.m >= m || root.n >= n ){
      return;
    }

    root.left  = new BoxNode(root.m, root.n -1);
    root.right  = new BoxNode(root.m, root.n +1);
    root.top  = new BoxNode(root.m - 1, root.n);
    root.bottom  = new BoxNode(root.m + 1, root.n );
    if(!root.right.visited){
      helper(root.right,m,n);// right
    }
    if(!root.left.visited){
      helper(root.left,m,n);//left
    }
    if(!root.bottom.visited){
      helper(root.bottom,m,n);//bottom
    }
    if(!root.top.visited){
      helper(root.top,m,n);//top
    }



  }




}
