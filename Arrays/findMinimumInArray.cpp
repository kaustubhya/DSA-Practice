#include <iostream>
#include <limits.h>
using namespace std;

int findMinElement (int arr[], int size) {
    int minAns = INT_MAX;
    for(int i = 0; i < size; i++) {
        if(arr[i] < minAns) {
            minAns = arr[i];

        }
    }

    return minAns;

}

int main()
{
    int arr [] = {1,2,3,-1,-2,-3, -9};
    int size = 7;

    // in cpp simply calling function and returning ans won't work, hence, we store them under a variable and then cout them
    int ans = findMinElement(arr, size);
    cout << "Minimum element of the Array is: " << ans << endl;
    return 0;
}

