#include <iostream>
using namespace std;

int main() {
  // Checking if a number is +ve, -ve or zero

    int num = -50;

    if(num > 0) {
        cout << "Positive" << endl;
    }

    else if(num < 0) {
        cout << "Negative" << endl;
    }

    else {
        cout << "Zero" << endl;

    }

    return 0;
}