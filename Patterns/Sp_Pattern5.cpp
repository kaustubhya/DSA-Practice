/*
1
1 2
1  3
1   4
12345
*/


#include <iostream>
using namespace std;

int main() {

  int n;
  cout << "Enter row number: " << endl;
  cin >> n;
  cout << endl;

  for(int i = 0; i < n; i++) {


    for(int k = 0; k < i + 1; k++) {

       if(i == 0) {
         cout << 1;
       }
      
       else if(i == n - 1) {
         cout << k + 1;
       }  

       else {
         if(k == 0) {
           // Giving additional space here
           cout<< 1 <<" ";
         }

         else if(k == i + 1 - 1) {
           cout << i + 1;
         }
         else {
           cout << " ";
         }
       }        
       
    }

     cout << endl;

  }

} 