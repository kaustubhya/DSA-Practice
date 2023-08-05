 class primeNos { 
    public static void main(String[] args) {
    // Prime No. 
  boolean ans = isPrime(29);
    System.out.println(ans);
    
  }

   static boolean isPrime (int num) {
      int c = 2;

     
       if(num == 1) {
       return false;
     }
      
    while(c * c <= num) {

      if(num % c == 0) {
        return false;
      }
      c++;

     
    }
    return true;

     
  }  
 }