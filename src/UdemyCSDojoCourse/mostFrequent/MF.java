package UdemyCSDojoCourse.mostFrequent;

import java.util.HashMap;
import java.util.Map;

public class MF {
  public static void main(String[] args) {
    // NOTE: The following input values are used for testing your solution.

    // mostFrequent(array1) should return 1.
    int[] array1 = {1, 3, 1, 3, 2, 1};
    // mostFrequent(array2) should return 3.
    int[] array2 = {3, 3, 1, 3, 2, 1};
    // mostFrequent(array3) should return null.
    int[] array3 = {};
    // mostFrequent(array4) should return 0.
    int[] array4 = {0};
    // mostFrequent(array5) should return -1.
    int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

    testFunction(array1);
    testFunction(array2);
    testFunction(array3);
    testFunction(array4);
    testFunction(array5);
  }

  public static void testFunction(int[] arr){
    System.out.println(mostFreqent(arr));
  }

  // Implement your solution below.
  public static Integer mostFreqent(int[] givenArray) {
    Integer maxItem = null;
    int maxCount = 0;

    Map<Integer, Integer> map = new HashMap<>();
    for(int i:givenArray){
      if(map.containsKey(i)){
        map.put(i, map.get(i) + 1);

      }else{
        map.put(i, 1);
      }
      int count = map.get(i);
      if(count > maxCount){
        maxCount = count;
        maxItem = i;
      }
    }



    return maxItem;
  }
}
