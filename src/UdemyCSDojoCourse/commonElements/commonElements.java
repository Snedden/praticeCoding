package UdemyCSDojoCourse.commonElements;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class commonElements {

  public static ArrayList<Integer> commonElements(int[] A, int[] B){
    Set<Integer> set = new HashSet<>();
    ArrayList<Integer> commonElems = new ArrayList<>();
    for(Integer i:A){
      set.add(i);
    }

    for(Integer i:B){
      if(set.contains(i)){
        commonElems.add(i);
      }
    }

    return commonElems;
  }

}
