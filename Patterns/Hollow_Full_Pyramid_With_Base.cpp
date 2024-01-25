/*
    *
   * *
  *   *
 *     *
*********

*/

#include <iostream>
using namespace std;

int main() {

  int n;
  cout << "Enter row number: " << endl;
  cin >> n;
  cout << endl;

  for (int i = 0; i < n; i++) {
    // making matrix

    // For stars, we take a new variable k. We put it inside the outer loop as
    // we want k to change after every outer loop iteration.
    int k = 0; // starting from 0
    for (int j = 0; j < (2 * n) - 1; j++) {

      // 3 Cases

      // a. spaces

      if (j < n - i - 1) {
        cout << " ";
      }

        // b. stars

      else if (k < 2 * i + 1) {
        if (k == 0 || k == (2 * i) || i == n - 1) {
          // Taking care of first and last column of stars and last row of matrix
          cout << "*";
        }

        else {
          cout << " ";
        }

        k++; // incrementing k in case of stars
      }

      // c. spaces again 
      else {
        cout << " ";
      }
    }

    cout << endl;
  }
}