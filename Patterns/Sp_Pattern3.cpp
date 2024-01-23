/*

1
22
333
4444
55555

*/

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

    for (int j = 0; j < i + 1; j++) {

      /*
      Here
      r0 -> 1 element
      r1 -> 2 element
      r2 -> 3 element
      r3 -> 4 element

      Hence we used i + 1

      */
     
        cout << count;  

    } // inner loop over

    cout << endl;
    count = count + 1;
  }

  return 0;
}