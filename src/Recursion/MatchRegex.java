package Recursion;

public class MatchRegex {
  public static boolean isMatch( String pattern, String input){
    //case 1 = pattern = "", input = ""  -> true
    if(pattern.isEmpty()) return input.isEmpty();

    boolean firstMatch = (!input.isEmpty() &&((input.charAt(0) == pattern.charAt(0)) || (pattern.charAt(0) == '.')));
    //Case2
    //subCase1 :  pattern = a*b  input = ab -> (a*b,b) -> (b,b) -> true
    //subCase2 : pattern = a*  input = ab -> (a*, b) ->  ->subCase1 -> ("", "b")-> true
    if(pattern.length() >= 2 && pattern.charAt(1) == '*'){
      boolean subCase1 = isMatch(pattern.substring(2), input);
      boolean subCase2 = firstMatch && isMatch(pattern, input.substring(1));
      return (subCase1 || subCase2 );
    }

    // case3 pattern = abc , input = abc -> a==a && (bc,bc) -> b==b && (c,c) -> c==c &&("","")->true
    else return (firstMatch) && (isMatch(pattern.substring(1),input.substring(1)));

  }


}
