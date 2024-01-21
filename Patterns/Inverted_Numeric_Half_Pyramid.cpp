#include <iostream>
using namespace std;

/*

r = 5

12345
1234
123
12
1

*/

int main() {

    int r;
    cout << "Enter the number of rows ";
    cin >> r;
    cout << endl;
    
    for(int i = 0; i < r; i++) {

      for(int j = 0; j < r - i; j++) {


        /*
        // r = 5
        // i = 0
        // here let us say row = 5
        row 0 = 5 - 0 = 5, hence we do 
        col 0 -> 0 + 1 = 1
        col 1 -> 1 + 1 = 2
        col 2 -> 2 + 1 = 3
        col 3 -> 3 + 1 = 4
        col 4 -> 4 + 1 = 5

        row 1 = 5 - 1 = 4, hence we do
        col 0 -> 0 + 1 = 1
        col 1 -> 1 + 1 = 2
        col 2 -> 2 + 1 = 3
        col 3 -> 3 + 1 = 4

          row 2 = 5 - 2 = 3, hence we do
          col 0 -> 0 + 1 = 1
          col 1 -> 1 + 1 = 2
          col 2 -> 2 + 1 = 3

          and so on....
          */

        // Not printing stars here ↓
       
        cout << j + 1 ;
            
      }
      cout << endl;
    
    }
  return 0;
}