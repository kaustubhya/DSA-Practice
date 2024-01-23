#include<iostream>
using namespace std;


/*

    * 
   * * 
  *   * 
 *     * 
*       *         
*       * 
 *     *
  *   * 
   * * 
    * 


*/

// Hollow Diamond

// Combine Hollow ful pyramid and Hollow Inverted full pyramid

// 🛑🛑🛑🛑🛑🛑 Also traverse each separately and make n = n/2


// Space logic will be same

int main(){

  int n;
  cout << "Enter row number: " <<endl;
  cin >> n;
  cout << endl;

  n = n/2;


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

      if((k == 0) || (k  == i)) {
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