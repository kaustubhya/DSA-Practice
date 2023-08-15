package Arrays;

public class plusOne {
    
        public int[] plusOne(int[] digits) {
    
            // if (digits.length == 0) {
            //     return null;
            // }
           
           // here we'll move the loop in reverse direction from 9 to 1
           for(int i = digits.length - 1; i >= 0; i--) {
               // checking if the last digit is not nine
               if(digits[i] < 9) {
                   digits[i]++;  // Adding 1 to the last digit
                   // Array case, look closely
                   return digits;
               }
    
               // if last digit is nine then make them zero
               digits[i] = 0;
           }
    
           // now including the carry 1 in the array
    
           int[] newArray = new int[digits.length + 1];
           newArray[0] = 1;  // putting the carry here for all 9s which were converted to 0s
    
           return newArray;
    
    
            
        }
    
}
