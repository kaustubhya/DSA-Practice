/*
*******     
*    *
*   *
*  *
* *
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

    for(int k = 0; k < n - i; k++) {

       if(i == 0 || i == n - 1) {
         cout << "*";
       }

       else {
         if((k == 0) || (k == n - i - 1)) {
           cout<<"*";
         }

          else {
            cout << " ";
          }   
       }        
       
    }

     cout << endl;

  }

} 

