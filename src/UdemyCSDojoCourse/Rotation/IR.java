package UdemyCSDojoCourse.Rotation;

import java.util.Arrays;

public class IR {
  public static void main(String[] args) {
    // NOTE: The following input values will be used for testing your solution.
    int[] array1 = {1, 2, 3, 4, 5, 6, 7};
    int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
    // isRotation(array1, array2a) should return false.
    int[] array2b = {4, 5, 6, 7, 1, 2, 3};
    // isRotation(array1, array2b) should return true.
    int[] array2c = {4, 5, 6, 9, 1, 2, 3};
    // isRotation(array1, array2c) should return false.
    int[] array2d = {4, 6, 5, 7, 1, 2, 3};
    // isRotation(array1, array2d) should return false.
    int[] array2e = {4, 5, 6, 7, 0, 2, 3};
    // isRotation(array1, array2e) should return false.
    int[] array2f = {1, 2, 3, 4, 5, 6, 7};
    // isRotation(array1, array2f) should return true.

    isRotation(array1,array2b);
  }

  // Implement your solution below.
  public static Boolean isRotation(int[] array1, int[] array2) {
    StringBuilder s1 = new StringBuilder();
    StringBuilder s2 = new StringBuilder();

    for(Integer i:array1){
      s1.append(i);
    }
    for(Integer i:array2){
      s2.append(i);
    }

    if(s1.length() == s2.length()){
      String s1s1 = s1.append(s1).toString();
      boolean subString = s1s1.contains(s2.toString());
      return subString;
    }
    return false;
  }
}
