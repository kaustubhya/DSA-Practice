// Flipped Solid Diamond
/* ```
***** *****
****   ****
***     ***
**       **
*         *
*         *
**       **
***     ***
****   ****
***** *****
```

*/


// ## Combined Full Code (Top Half + Bottom Half)


#include<iostream>
using namespace std;


int main(){

  int n;
  cout << "Enter row number: " <<endl;
  cin >> n;
  cout << endl;


  n = n/2;

  // Here we will break this pattern into 2 halves, top and bottom


  // Top Half

  // In the top half, we break it into further 3 halves, 1 inverted right half pyramid, 1 full pyramid and 1 inverted left half pyramid


  // 1st half outer loop
  for(int i = 0; i < n; i++) {
    // 1st inverted right half pyramid
    for(int j = 0; j < (n - i); j++) {
      cout << "*";
      // Giving no spaces 
    }

    // Now full pyramid (Special case) (considering the latter spaces too)
    /*
    r0 -> 1 space
    r1 -> 3 spaces
    r2 -> 5 spaces
    r3 -> 7 spaces
    
    So let us do: 2i + 1

    */
    for(int k = 0; k < (2*i + 1); k++) {
      cout << " ";
      // Giving one space space
    }

    // Now inverted left half pyramid

    for(int m = 0; m < (n - i); m++) {
      cout << "*";
      // Giving no spaces
    }
    cout << endl;
  }



  // Bottom Half

  // 2nd half outer loop
  for(int i = 0; i < n; i++) {
    // 1st inverted right half pyramid
    for(int j = 0; j < (i + 1); j++) {
      cout << "*";
      // Giving no spaces 
    }

    // Now full pyramid (Special case) (considering the latter spaces too)
    /*
    r0 -> 7 spaces
    r1 -> 5 spaces
    r2 -> 3 spaces
    r3 -> 1 space

    So let us do: 2n - 2i - 1
    
    
    
    // 🛑🛑🛑🛑🛑🛑 Also keep in mind of using brackets as if we do 2n - (2i -1), we might get a different pattern

    */
    for(int k = 0; k < (2*n - 2*i - 1); k++) {
      cout << " ";
      // Giving one space space
    }

    // Now inverted left half pyramid

    for(int m = 0; m < (i + 1); m++) {
      cout << "*";
      // Giving no spaces
    }
    cout << endl;
  }

  
  return 0;

}


