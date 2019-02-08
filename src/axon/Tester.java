package axon;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tester {
  public static void main(String[] args){
    String mapStr1= "X__;_OT;___";
    drawMap(mapStr1);

    int steps = Path.stepsTo(mapStr1);
    System.out.println("Steps "+steps);
  }

  public static void drawMap(String mapStr){
    LatticeNode map = Path.createMap(mapStr);
    drawMap(map);

  }

  public static void drawMap(LatticeNode n ){
    if(n != null){

      System.out.print(" "+n.symbol+" ");

      if(n.right.right != null){
        System.out.print("<->");
        drawMap(n.right);

      }else{
        System.out.print("\n");
      }
      if(n.left == null)
        drawMap(n.bottom);
    }
  }
}
