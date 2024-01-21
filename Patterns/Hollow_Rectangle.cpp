#include <iostream>
using namespace std;

/*
*******
*     *
*     *
*     *
*******
*/

int main() {

    int r;
    cout << "Enter the number of rows ";
    cin >> r;
    cout << endl << "Enter the number of columns ";
    int c;
    cin >> c;
  
    cout << endl;


// Top Row
  for(int i = 0; i < c; i++) {
    cout << "* ";
  }

  cout << endl;

    for(int i = 0; i < r - 2; i++) {

    // First Star 
      cout << "* ";

      // Spaces
        for(int j = 0; j < c - 2; j++) {
            
            cout << "  ";

        }

        // Last Star
        cout << "*";

        // Next Row
        cout << endl;

    }

    // Bottom Row
    for(int i = 0; i < c; i++) {
      cout << "* ";
  }
  
}



// Another Way Using if-else

/*
#include <iostream>
using namespace std;


*******
*     *
*     *
*     *
*******


int main() {

    int r;
    cout << "Enter the number of rows ";
    cin >> r;
    cout << endl << "Enter the number of columns ";
    int c;
    cin >> c;
  
    cout << endl;

    for(int i = 0; i < r; i++) {

      if((i == 0) || (i == r - 1)) {
        for(int i = 0; i < c; i++) {
          cout << "* ";
        }
        cout<<endl;
      }        

      else {
      cout << "* ";
        for(int j = 0; j < c - 2; j++) {
            
            cout << "  ";

        }
        cout << "*";
        cout << endl;

      }
    
    }
}
*/

