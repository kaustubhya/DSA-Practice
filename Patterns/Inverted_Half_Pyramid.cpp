#include <iostream>
using namespace std;

/*

r = 4

****
***
**
*


*/

int main() {

    int r;
    cout << "Enter the number of rows ";
    cin >> r;
    cout << endl;
    
    for(int i = 0; i < r; i++) {

      for(int j = 0; j < r - i; j++) {
        // here let us say row = 4
        /* 
        then
          r0 -> 4 - 0(i) = 4
          r1 = 4 - 1(i) = 3
          r2 = 4 - 2(i) = 2
          r3 = 4 - 3(i) = 1
          */
       
        cout << "* ";
            
      }
      cout << endl;
    
    }
  return 0;
}