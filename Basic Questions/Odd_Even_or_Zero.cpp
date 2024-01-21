#include <iostream>
using namespace std;

int main() {

  // Checking if a number is odd, even or zero

  int num;
  cout << "Enter the number: " <<endl; 
  cin >> num;
  cout << endl;

  if(num == 0) {
    cout << "Zero"<<endl;
  }

  else if((num % 2) == 0) {
    cout << "Even"<<endl;
  }

  else {
    cout << "Odd"<<endl;

  }
  return 0;

}