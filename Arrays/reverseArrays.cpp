#include <iostream>
using namespace std;


void reverseArray(int arr[], int size) {
    int left = 0;
    int right = size - 1;

    while(left <= right) {
       
       // using the swap function which is the internal function in cpp

       swap(arr[left], arr[right]);

       // in java, make your own swap array function

        left++;
        right--;
    }

    // we could have also used for loop but it would have been a bit complex
    
    /* for(int left = 0, right = size - 1; left <= right; left++, right--) {
        swap(arr[left], arr[right]);
        left++;
        right--;
    } */

    cout<<"Here is your reversed array: " << endl;

    for(int i = 0; i < size; i++) {
        cout<<arr[i] << " ";
    }
        cout<< endl;


}


int main() {
    int arr[] = {1,2,3,4,5};
    int size = 5;

    reverseArray(arr, size);

    // test with even array elements too
    int arrEven[] = {2,4,6,8};
    int sizeEven = 4;
    reverseArray(arrEven, sizeEven);

    return 0;

}