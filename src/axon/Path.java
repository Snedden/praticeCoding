package axon;

public class Path {
  public static int stepsTo(String mapStr){
    int steps = 0;
    LatticeNode map = createMap(mapStr);

    return steps;
  }

  public static LatticeNode createMap(String mapStr){
    LatticeNode root = new LatticeNode();
    String[] mapStrArr = mapStr.split(";");
    int rows = mapStrArr.length;
    int cols = mapStrArr[rows].length();
    createMapHelper(root, mapStrArr, 0, 0, rows, cols);
    return root;

  }

  private static void createMapHelper(LatticeNode n,String[] s, int i, int j,int rows, int cols){


    if(i > rows && j > cols ){
      return;
    }
    if(j < cols){
      n.symbol = s[i].charAt(j);
      n.right = new LatticeNode();
      n.right.left = n;

      if(j != 0){
        n.left = new LatticeNode();
        n.left.right = n;
      }
      if(i != 0){
        n.top = new LatticeNode();
        n.top.bottom = new LatticeNode();
      }
      if(i != rows - 1){
        n.bottom = new LatticeNode();
        n.bottom.top = new LatticeNode();
      }
      createMapHelper(n.right,s, i, j+1, rows, cols);
    }else{
      createMapHelper(n.bottom, s, i+1, 0, rows, cols);
    }
  }

}
