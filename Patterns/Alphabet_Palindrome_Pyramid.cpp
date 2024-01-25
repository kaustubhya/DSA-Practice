/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA
*/


#include <iostream>
using namespace std;

int main() {

  int n;
  cout << "Enter row number: " << endl;
  cin >> n;
  cout << endl;

 

  for(int i = 0; i < n; i++) {

    char ch;
    int number;

    for(int j = 0; j < i + 1; j++) {
      number = j + 1;
      ch = number + 'A' - 1;
      cout << ch;

    }

    // Using a char for loop here
    for(char k = ch; k > 'A'; ) {
      // To use ch here also, we declared it outside the inner loops

      // Also to avoid getting numbers we do char subtraction and loop updation here

      k = k - 1;

      
      cout << k;
    }

    cout << endl;

    

  }

} 
