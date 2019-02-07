package leetCode.InterviewQuestions.twoSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tester {
  public static void main(String[] args){

    test(new int[]{2, 7, 11, 15}, 9);
  }

  private static void test(int[] arr, int target){
    int[] result = MySolution.twoSum(arr, target);
    System.out.println(Arrays.toString(result));
  }
}
