/*
Given an array {10, 20, 30, 40, 50, 60}

Print the output as:

{10, 60, 20, 50, 30, 40}
i.e. {left, right, left+1, right-1, left+2, right-2, ......}  

Here left = 0
right = size - 1
*/


#include <iostream>
using namespace std;


void extremeArray(int arr[], int size) {
    int left = 0;
    int right = size - 1;

    while(left <= right) {
        if(left != right) {
            cout<<arr[left]<<" ";

            cout<<arr[right]<<" ";
        }

        else {

            cout<<arr[left]<<" ";


        }
        
        left++;
        right--;
    }

    cout<<endl;


}


int main() {
    int arr[] = {10,20,30,40,50,60};
    int size = 6;

    cout<<"Even"<<endl;
    extremeArray(arr, size);


    int arr2[] = {10,20,30,40,50};
    int size2 = 5;

    cout<<"Odd"<<endl;
    extremeArray(arr2, size2);

    return 0;
}