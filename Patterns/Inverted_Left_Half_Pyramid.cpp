/*
 *****
  ****
   ***
    **
     *
*/

#include <iostream>
using namespace std;

int main() {

  int n;
  cout << "Enter row number: " << endl;
  cin >> n;
  cout << endl;

  for(int i = 0; i < n; i++) {


    for(int j = 0; j < i + 1; j++) {

      cout << " ";      

    } 

    for(int k = 0; k < n - i; k++) {
      cout << "*";
    }

     cout << endl;

  }

} 