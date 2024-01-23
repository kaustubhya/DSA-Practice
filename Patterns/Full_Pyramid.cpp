#include<iostream>
using namespace std;


/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/

int main(){

  int n;
  cout << "Enter row number: " <<endl;
  cin >> n;
  cout << endl;
 
  for(int i = 0; i < n; i++) {
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
    // formula: i + 1
    for(int k = 0; k < i + 1; k++) {
      cout << "* ";
    }
    cout << endl;
  }
   return 0;
}