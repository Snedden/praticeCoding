package UdemyCSDojoCourse.commonElements;

import java.util.Arrays;

public class Tester {
  public static void main(String[] args){
    //1 OP: 3,4
    int[] A1 = new int[]{1,2,3,4};
    int[] B1 = new int[]{3,4};

    //2 OP: Empty? null?
    int[] A2 = new int[]{1};
    int[] B2 = new int[]{3,4};

    //3 OP: 3 4 5 6
    int[] A3 = new int[]{1,5,4,3,2,3,6,7};
    int[] B3 = new int[]{3,4,5,6,10,8};


    testFunction(A1,B1);
    testFunction(A2,B2);
    testFunction(A3,B3);
  }

  public static void testFunction(int[] A, int[] B){
    for(Integer i:commonElements.commonElements(A,B)) {
      System.out.print(i+" ");
    }
    System.out.print("\n");
  }
}
