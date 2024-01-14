// Binary to Decimal Conversion

#include <iostream>
#include <cmath> // to include the pow function
using namespace std;

int binaryToDecimalDivisionMethod(int n) {
    // Division Method
  int decimalNo = 0;
  int i = 0; 
  // i is the power of 2 which keeps getting incremented
  while(n > 0) {
    int bit = n % 10;
    decimalNo += bit * pow(2, i++); // increments from 0,1,2,...
    n = n / 10;
  }
  cout << "Here is the decimal number from division method: "<<endl;
  return decimalNo;

}


int binaryToDecimalBitwiseMethod(int n) {
    // Bitwise Method
  int decimalNo = 0;
  int i = 0; 
  // i is the power of 2 which keeps getting incremented
  while(n > 0) {
    int bit = n % 10;
    decimalNo += bit << i;
    // By using left shift we are doing 2^i basically
    
    
    n = n / 10;
    i++;
  }
  cout << "Here is the decimal number from bitwise method: "<<endl;
  return decimalNo;

}

int main() {
  int n;
  cout << "Enter the binary value"<<endl;
  cin >> n;
  int decimal = binaryToDecimalDivisionMethod(n);
  cout << decimal << endl;

  int decimal2 = binaryToDecimalBitwiseMethod(n);
  cout << decimal2 << endl;

  return 0;
}