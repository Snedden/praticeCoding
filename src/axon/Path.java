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
    createMap(root, mapStrArr);
    return root;

  }

  private static void createMap(LatticeNode n,String[] st){

    LatticeNode curRow = n;
    LatticeNode p;
    LatticeNode prevRow = n;
    boolean firstRow = true;

    for(String s: st){
      for(char c:s.toCharArray()){
        if(c != ';'){
          n.symbol = c;
          if(n.symbol == 'O'){
            cop = n;
          }
          n.right = new LatticeNode();
          n.right.left = n;
          n = n.right;
        }else{
          break;
        }
      }
      if(!firstRow){
        n = curRow;
        //Thread top and bottom rows
        while(n.right != null){
          prevRow.bottom = n;
          n.top = prevRow;
          n= n.right;
          prevRow = prevRow.right;
        }
        prevRow = curRow;

      }
      firstRow = false;
      curRow.bottom = new LatticeNode();
      curRow = curRow.bottom;
      n = curRow;
      //next row at bot
    }
  }


  /**
   * Find the shortest path to target
   * @return steps of the shorted path
   */
  public static int pathBSF(){
    LinkedList<LatticeNode> queue = new LinkedList<>();
    queue.add(cop);
    int steps = -1;

    while(!queue.isEmpty()){
      LatticeNode cur = queue.removeFirst();
      cur.visited =true;

      if(cur.symbol == 'T'){
        steps = cur.steps;
        break;
      }

      for(LatticeNode n:cur.getNeighbours()){
        if(!n.visited && n.symbol != 'X'){
          n.steps = cur.steps +1;
          queue.add(n);
        }
      }
    }
    return steps;
  }

}
