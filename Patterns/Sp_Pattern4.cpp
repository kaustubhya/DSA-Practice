/*
1
2*2
3*3*3
4*4*4*4
3*3*3
2*2
1

*/

#include <iostream>
using namespace std;

int main() {

  int n;
  cout << "Enter row number: " << endl;
  cin >> n;
  cout << endl;

    n = n/2 + 1;
  // getting the same number of rows as the input entered


  // Here for this specific pattern, we will use 2 outer loops as we are keeping track of count, it is not possible to do with one outer loop

  int count = 1;
  for (int i = 0; i < n; i++) {
    // This was outer loop

      // Top Half
      for (int j = 0; j < 2 * i + 1; j++) {
        // Using IF-ELSE in this inner Loop

        /*
        Here
        r0 -> 1 element
        r1 -> 3 element
        r2 -> 5 element
        r3 -> 7 element

        Hence we used 2i + 1

        🛑🛑🛑🛑 Note here numbering starts from 0
        */
        if (j % 2 == 0) {
          cout << count;

        } else {
          cout << "*";
        }

      } // inner loop over

      cout << endl;
      count = count + 1;

  }

  // Outer loop 2
  count = count - 2;
  // Here say n is 10, in the upper half after 5th row, n gets from 5 to 6.
  // We want 4 in next row, so we subtract 2 from count initially and then in loop subtract 1 after each inner loop iteration

  for(int i = 0; i < n - 1; i++) {
// Here we did i <  n - 1 and not i < n as we donot want the duplication of 1st half's last row 

   /* eg.
  
   4*4*4*4
   5*5*5*5*5
   5*5*5*5*5
   4*4*4*4

   here we donot want the five 5* row 2 times, we only want it once
   */ 
    
    for(int j = 0; j < 2*n - 2*i - 3; j++){

    /* n = 5
      r0 -> 7 elements
      r1 -> 5 elements
      r2 -> 3 elements
      r3 -> 1 element

      so use: 2*n - 2*i - 3
      2*5 - 2*0 - 3 = 10 - 0 - 3 = 7
      2*5 - 2*0 - 3 = 10 - 0 - 3 = 7
      2*5 - 2*0 - 3 = 10 - 0 - 3 = 7
      2*5 - 2*0 - 3 = 10 - 0 - 3 = 7

    */  
      
      if (j % 2 == 0) {
        cout << count;

      } else {
        cout << "*";
      }
      
    }
    count = count - 1;
    cout << endl;
  }

} 