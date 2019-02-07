package UdemyCSDojoCourse.awayFrom;

public class AwayFrom {
  static  boolean isOneAway(String a, String b){
    if(Math.abs(a.length() - b.length())>1)
      return false;

    return awayBy(a,b)>1?false:true;
  }



  static int awayBy(String a, String b){
    int al = a.length();
    int bl = b.length();
    int diff = 0;

    if(al == 0) return bl;
    if(bl == 0) return al;
    if(al == 0 && bl == 0) return 0;
    if(al == bl &&(al == 1 || al ==2)){
      for(int i=0; i < al;i++){
        if(a.charAt(i) != b.charAt(i)){
          diff++;
        }
      }
      return diff;
    }
    else if(al == 1 || bl == 1){
      diff = al > bl? al - 1: bl - 1;
      if(a.charAt(0) != b.charAt(0)){
        diff++;
      }
      return diff;
    }
    else{
       return awayBy(a.substring(0,2),b.substring(0,2)) + awayBy(a.substring(2),b.substring(2));
    }

  }

}
