#include<iostream>
using namespace std;


/*
    * 
   * * 
  *   * 
 *     *       
*       * 

*/


// Now this is a hollow full pyramid, it works similar to a full pyramid, but to remove the inside stars, we will use IF-ELSE. If the column number is 0 or last, then print star else print nothing

// Space logic will be same

int main(){

  int n;
  cout << "Enter row number: " <<endl;
  cin >> n;
  cout << endl;

  // 1. Full Pyramid

    // Full Pyramid Outer Loop
    for(int i = 0; i < n; i++) {

      
      // General Full Pyramid Logic
      // here there are say 5 rows,
      // In each row,:
      /* r0 => 4 spaces 1 star
        r2 => 3 spaces 2 stars
        r3 => 2 spaces 3 stars
        r4 => 1 spaces 4 stars
        r5 => 0 spaces 5 stars
      */

      // printing spaces:
      // formula, n - i - 1
      for(int j = 0; j < n - i - 1; j++) {
        cout << " ";
      }
      // printing stars

      // Apply if-else logic

      // formula: i + 1
      for(int k = 0; k < i + 1; k++) {

        // If condition changes according to inner loop limits
        if((k == 0) || (k  == (i + 1 - 1))) {
          // if we used 1 based indexong then row => 1 to i + 1 where last row = i + 1

          // if we used 0 based indexong then row => 0 to i + 1 - 1 (i + 1 - 1  = i) where last row = i

          
          cout << "* ";
        }

        else {
          // here there will also be an additional space
          cout << "  ";

        }
      }
      cout << endl;
    }

  return 0;
}