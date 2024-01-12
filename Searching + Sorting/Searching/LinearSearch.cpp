// Arrays + Searching

#include <iostream>
using namespace std;

int main() {
    int arr[5] = {1,2,3,4,10};
    int target = 100;
    int n = 5;

    // we use a boolean flag to check if the target is found or not
    bool flag = false;

    for(int i = 0; i < n; i++) {
        if(arr[i] == target) {
            flag = true;
            break;
        }

    }

    if(flag) {
        cout << "Target found";

    }
    else {
        cout << "Target Not found";
    }

    return 0;
}