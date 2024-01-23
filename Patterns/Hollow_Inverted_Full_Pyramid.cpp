#include<iostream>
using namespace std;


/*
        
*       * 
 *     *
  *   * 
   * * 
    * 


*/


// Now this is a hollow inverted full pyramid, it works similar to a inverted full pyramid, but to remove the inside stars, we will use IF-ELSE. If the column number is 0 or last, then print star else print nothing

// Space logic will be same

int main(){

  int n;
  cout << "Enter row number: " <<endl;
  cin >> n;
  cout << endl;


    // Inverted Full Pyramid Outer Loop
    for(int i = 0; i < n; i++) {

      
      // General Full Pyramid Logic
      // here there are say 5 rows,
      // In each row,:
      /* r0 => 0 spaces 5 stars
        r2 => 1 spaces 4 stars
        r3 => 2 spaces 3 stars
        r4 => 3 spaces 2 stars
        r5 => 4 spaces 1 star
      */

      // printing spaces:
      // formula, n - (n - i)
      for(int j = 0; j < n - (n - i); j++) {
        cout << " ";
      }
      // printing stars

      // Apply if-else logic

      // formula: n - i
      for(int k = 0; k < n - i; k++) {

        // If condition changes according to inner loop limits

        if((k == 0) || (k  == (n - i - 1))) {
          // if we used 1 based indexong then row => 1 to n - i where last row = n - i

          // if we used 0 based indexong then row => 0 to n - i - 1 where last row = n - i - 1

          
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



