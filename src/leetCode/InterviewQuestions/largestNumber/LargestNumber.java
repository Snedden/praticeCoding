package leetCode.InterviewQuestions.largestNumber;

public class LargestNumber {
  public static String largestNumber(int[] nums) {
    int end = nums.length;
    StringBuilder sb = new StringBuilder();
    sb.append("");
    while(end != 0){
      for(int i = 0; i< nums.length - end; i++){
        if(findLarger(nums[i],nums[i+1])){
          int temp = nums[i];
          nums[i] = nums[i+1];
          nums[i+1] = temp;

        }
      }
      end--;
    }

    for(int i = nums.length-1 ;i> -1; i--){
      sb.append(nums[i]);
    }

    return sb.toString();


  }

  private static boolean findLarger(double a, double b){
    return true;

  }
}
