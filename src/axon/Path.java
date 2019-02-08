package axon;

import org.omg.CORBA.INTERNAL;

import java.util.LinkedList;

public class Path {
  static LatticeNode cop = new LatticeNode();
  public static int stepsTo(String mapStr){
    LatticeNode map = createMap(mapStr);
    return pathBSF();
  }

  public static LatticeNode createMap(String mapStr){
    LatticeNode root = new LatticeNode();
    String[] mapStrArr = mapStr.split(";");
    int rows = mapStrArr.length;
    int cols = mapStrArr[rows-1].length();
    createMapHelper(root, mapStrArr, 0, 0, rows, cols);
    return root;

  }

  private static void createMapHelper2(LatticeNode n,String[] st){
    LatticeNode prevRow;
    LatticeNode curRow = n;

    for(String s: st){

    }
  }

  private static void createMapHelper(LatticeNode n,String[] s, int i, int j,int rows, int cols){
    if(n != null){
      if(i > rows && j > cols ){
        return;
      }
        //Create new node
        n.symbol = s[i].charAt(j);
        if(n.symbol == 'O'){
          cop = n;
        }
        if(j < cols){
          n.right = new LatticeNode();
          n.right.left = n;
        }
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

        //Create next right nodes
        if(j+1 < cols){
          createMapHelper(n.right,s, i, j+1, rows, cols);
        }

        //Create next bottom node
        if(i+1 < rows){
          if(i!=rows){
            cols = s[i+1].length();
          }
          createMapHelper(n.bottom, s, i+1, 0, rows, cols);
        }
    }

  }

  public static int pathBSF(){
    LinkedList<LatticeNode> queue = new LinkedList<>();
    queue.add(cop);
    int steps = Integer.MAX_VALUE;

    while(!queue.isEmpty()){
      LatticeNode cur = queue.removeFirst();
      cur.visited =true;
      if(cur.symbol == 'T'){
        steps = cur.steps;
        break;
      }

      for(LatticeNode n:cur.getNeighbours()){
        if(!n.visited && n.symbol != 'X'){
          n.steps++;
          queue.add(n);
        }
      }
    }
    return steps;
  }

}
