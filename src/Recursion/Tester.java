package Recursion;

public class Tester {
  public static void main(String[] args){
    //False
    String i1 = "ab";
    String p1 = "ab";
    //tester(p1, i1, true);

    //False
    String i2 = "abc";
    String p2 = "ab";
    //tester(p2, i2, false);

    //True
    String i3 = "aa";
    String p3 = "a*"; //("",aa) -> ("a*",a)->(a*,"")->("","") ->true
    tester(p3, i3, true);

    //True
    String i4 = "a*c*";
    String p4 = "abcerer";
    //tester(p4, i4, false);

    //False
    String i5 = "aaccb";  // (a*c*b*,aacb) => (c*b*,aacb )=> (c*b*, acb )=> (c*b*, cb) => (b*,cb) => (b*, b) => ("",b)
    String p5 = "a*c*b*";
    //tester(p5, i5, true);

    //true
    String i6 ="";
    String p6 = ".*";
    //tester(p6, i6, true);
  }

  public static void tester(String pattern, String input, boolean Expected){
    boolean matched = MatchRegex.isMatch(pattern, input);
    String message = matched? " matched ": " did not match ";
    System.out.println("Input `"+input+"` pattern `"+pattern+"`"+message);
    if(Expected == matched){
      System.out.println("Test passed");
    }else{
      System.out.println("Test failed!!!");
    }


  }
}
