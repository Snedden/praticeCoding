package UdemyCSDojoCourse.awayFrom;

public class Tester {

  public static void main(String[] args){
    //1
    String a1 = "abde";
    String b1 = "abcde";
    tester(a1,b1);

    //2
    String a2 = "abcdeff";
    String b2 = "abcdf";
    tester(a2,b2);

    //3
    String a3 = "abcdeff";
    String b3 = "cabcdf";
    tester(a3,b3);

    //4
    String a4 = "abcdeff";
    String b4 = "";
    tester(a4,b4);

    //5
    String a5 = "";
    String b5 = "";
    tester(a5,b5);

  }

  public static void tester(String a, String b){
    System.out.println("Difference of "+a+" and "+b+" is "+AwayFrom.awayBy(a,b));
  }

}
