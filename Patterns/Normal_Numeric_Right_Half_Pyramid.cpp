/*
1
12
123
1234
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


    for(int j = 0; j < i + 1; j++) {

     cout << j + 1;

    } 

    cout << endl;

    

  }

} 