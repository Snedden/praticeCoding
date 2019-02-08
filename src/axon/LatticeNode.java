package axon;

import java.util.ArrayList;

public class LatticeNode {
  int steps;
  char symbol;
  boolean visited;
  LatticeNode left;
  LatticeNode top;
  LatticeNode right;
  LatticeNode bottom;

  public LatticeNode () { }

  public LatticeNode(char symbol){
    this.symbol = symbol;
    this.visited = false;
  }

  public ArrayList<LatticeNode> getNeighbours(){
    ArrayList<LatticeNode> neigh = new ArrayList<>();
    if(this.left != null){
      neigh.add(this.left);
    }
    if(this.top != null){
      neigh.add(this.top);
    }
    if(this.right != null){
      neigh.add(this.right);
    }
    if(this.bottom != null){
      neigh.add(this.bottom);
    }
    return neigh;
  }
}
