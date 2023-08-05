public class LeapYear {
    public static void main (String[] args) {
      boolean ans = isLeapYear(2012);
      System.out.println(ans);
    }
  
    static boolean isLeapYear(int year) {
  
      if (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0))) {
        return true;
      }
  
      return false;
    }
  }