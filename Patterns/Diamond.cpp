#include<iostream>
using namespace std;


/*
    * 
   * * 
  * * * 
 * * * *       
* * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/


// Here let us split it into 2 parts, 
// 1. Full Pyramid
// 2. Inverted Full Pyramid

int main(){

  int n;
  cout << "Enter row number: " <<endl;
  cin >> n;
  cout << endl;




  // Since we are splitting the structure into 2 halves, do n / 2 for the outer loops of each pyramid.
    
  
  // 1. Full Pyramid

    // Full Pyramid Outer Loop
    for(int i = 0; i < n / 2; i++) {
      // Full Pyramid is till n / 2 only if n is the total number of rows

      
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
      for(int j = 0; j < n/2 - i - 1; j++) {
        cout << " ";
      }
      // printing stars
      // formula: i + 1
      for(int k = 0; k < i + 1; k++) {
        cout << "* ";
      }
      cout << endl;
    }

  

    // 2. Inverted full Pyramid

    for(int i = 0; i < n / 2; i++) {
      // here there are say 5 rows,
      // In each row,:
      /* r0 => 0 spaces 5 stars
        r2 => 1 spaces 4 stars
        r3 => 2 spaces 3 stars
        r4 => 3 spaces 2 stars
        r5 => 4 spaces 1 star
      */

      // printing spaces:
      // formula, n - i - 1
      for(int j = 0; j < (n/2) - ((n/2) - i); j++) {
        cout << " ";
      }
      // printing stars
      // formula: n - i
      for(int k = 0; k < (n/2) - i; k++) {
        cout << "* ";
      }
      cout << endl;
    }

  
  return 0;
}