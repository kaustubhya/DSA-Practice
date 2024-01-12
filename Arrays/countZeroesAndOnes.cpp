#include <iostream>
using namespace std;

// Array here has only zeroes and ones

void countZeroesAndOnes (int arr[], int size) {
    int zeroCounter = 0;
    int oneCounter = 0;

    for(int i = 0; i < size; i++) {
        if(arr[i] == 0) {
            zeroCounter++;
        }
        else{
            oneCounter++;
        }
    }

    cout<< "Number of zeroes: " << zeroCounter<<endl;
    cout<<"Number of ones: " << oneCounter<<endl;
}
int main() {
    int arr[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,1,0,0,0,0,1,1,1};
    int n = 25;
    countZeroesAndOnes(arr, n);
    return 0;
}