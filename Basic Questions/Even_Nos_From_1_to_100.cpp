#include <iostream>
using namespace std;

int main() {

    // Even nos. from 1 to 100
    for(int i = 1; i <= 100; i++) {
        if((i % 2) == 0) {
            cout << i << " is an Even Number" << endl;
        }
    }
    return 0;
}