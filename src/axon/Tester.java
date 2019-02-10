package axon;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tester {
  public static void main(String[] args){
    // 1 -2
    String mapStr1= "X__;O_T;___";
    System.out.print("////////");
    int steps = Path.stepsTo(mapStr1);
    System.out.println("Steps "+steps);
    drawMap(mapStr1);

    //2 - -1
    String mapStr2= "O__;_XX_;_XT";
    System.out.print("////////");
    int steps2 = Path.stepsTo(mapStr2);
    System.out.println("Steps "+steps2);
    drawMap(mapStr2);

    //2 - 3
    String mapStr3= "___;OX_;_XT";
    System.out.print("////////");
    int steps3 = Path.stepsTo(mapStr3);
    System.out.println("Steps "+steps3);
    drawMap(mapStr3);


  }

  public static void drawMap(String mapStr){
    LatticeNode map = Path.createMap(mapStr);
    drawMap(map);

  }

  public static void drawMap(LatticeNode n ){
    if(n != null){

      System.out.print(" "+n.symbol+" ");

      if(n.right!= null){
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
