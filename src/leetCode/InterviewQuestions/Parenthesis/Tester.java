package leetCode.InterviewQuestions.Parenthesis;

import java.util.List;

public class Tester {
  public static void main(String[] args){
    List<String> parent = ParenthetisBackTracking.generateParenthesis(3);

    for(String s:parent){
      System.out.println(s);
    }
  }
}
