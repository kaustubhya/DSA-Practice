/*
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
*/

// Even -> Numbers
// Odd -> *

// Here we can use if-else for odd-even elements
#include <iostream>
using namespace std;

int main() {

  int n;
  cout << "Enter row number: " << endl;
  cin >> n;
  cout << endl;

  int count = 1;

  for (int i = 0; i < n; i++) {
    // This was outer loop

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

  return 0;
}