#include <iostream>
using namespace std;

/*

r = 5

1
12
123
1234
12345


*/

int main() {

    int r;
    cout << "Enter the number of rows ";
    cin >> r;
    cout << endl;
    
    for(int i = 0; i < r; i++) {

      for(int j = 0; j < i + 1; j++) {

        // r = 5
        // i = 0
        // here let us say row = 5
        /* 
       then
          r0 -> c0 -> 0 + 1 = 1
          r1 -> c1 -> 1 + 1 = 2
          r2 -> c2 -> 2 + 1 = 3
          r3 -> c3 -> 3 + 1 = 4
          r4 -> c4 -> 4 + 1 = 5
        */

        // Not printing stars here ↓
       
        cout << j + 1 ;
            
      }
      cout << endl;
    
    }
  return 0;
}