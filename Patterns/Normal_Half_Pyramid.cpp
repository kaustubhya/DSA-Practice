#include <iostream>
using namespace std;

/*

*
**
***
****


*/

int main() {

    int r;
    cout << "Enter the number of rows ";
    cin >> r;
    cout << endl;
    
    for(int i = 0; i < r; i++) {

      for(int j = 0; j < i + 1; j++) {
        // In each row the no. of stars = row no. + 1;
        // i.e. row 0 = 1 star, row 1  = 2 stars, row 2 = 3 stars and so on, so we did in inner loop j < i + 1

        cout << "* ";
            
      }
      cout << endl;
    
    }
  return 0;
}