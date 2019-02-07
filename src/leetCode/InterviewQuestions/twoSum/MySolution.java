package leetCode.InterviewQuestions.twoSum;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
public class MySolution {
  public static int[] twoSum(int[] arr, int t){
    int[] ret = new int[2];
    int l = arr.length;

    for(int i=0; i< l; i++){
      int c = t - arr[i];
      for(int j = i+1; j<l; j++){
        if(c == arr[j]){
          ret[0] = i;
          ret[1] = j;
        }
      }
    }
    return ret;
  }
}
