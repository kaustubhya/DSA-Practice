#include <iostream>
#include <cmath> // to include the pow function
using namespace std;

int decimalToBinaryDivisionMethod(int n) {
    // Division Method
  int binaryNo = 0;
  int i = 0; 
  // i is the power of 10 which keeps getting incremented
  while(n > 0) {
    int bit = n % 2;
    binaryNo += bit * pow(10, i++); // increments from 0,1,2,...
    n = n / 2;
  }
  cout << "Here is the binary number from division method: "<<endl;
  return binaryNo;

}


int decimalToBinaryBitwiseMethod(int n) {
    // Bitwise Method
  int binaryNo = 0;
  int i = 0; 
  // i is the power of 10 which keeps getting incremented
  while(n > 0) {
    int bit = n & 1;
    binaryNo += bit * pow(10, i++); // increments from 0,1,2,...
    n = n >> 1;
  }
  cout << "Here is the binary number from bitwise method: "<<endl;
  return binaryNo;

}

int main() {
  int n;
  cout << "Enter the decimal value"<<endl;
  cin >> n;
  int binary = decimalToBinaryDivisionMethod(n);
  cout << binary << endl;

  int binary2 = decimalToBinaryBitwiseMethod(n);
  cout << binary2 << endl;

  return 0;
}