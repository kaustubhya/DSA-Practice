#include <iostream>
using namespace std;

/*
*****
*****
*****
*/

int main() {

    int r;
    cout << "Enter the number of rows ";
    cin >> r;
    cout << endl << "Enter the number of columns ";
    int c;
    cin >> c;
  
    cout << endl;
    for(int i = 0; i < r; i++) {
        for(int j = 0; j < c; j++) {
            cout << "* ";

        }
        cout << endl;

        return 0;

    }
}