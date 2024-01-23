#include<iostream>
using namespace std;


/*

* * * * * 
 * * * * 
  * * * 
   * * 
    * 

*/

int main(){

  int n;
  cout << "Enter row number: " <<endl;
  cin >> n;
  cout << endl;
 
  for(int i = 0; i < n; i++) {
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
    for(int j = 0; j < n - (n - i); j++) {
        // Just so you know n - (n - i) = n
        // So we can do j < n also
      cout << " ";
    }
    // printing stars
    // formula: n - i
    for(int k = 0; k < n - i; k++) {
      cout << "* ";
    }
    cout << endl;
  }
   return 0;
}