/*Given an array arr of n non-negative numbers. The task is to find the first equilibrium point in an array. The equilibrium point in an array is an index (or position) such that the sum of all elements before that index is the same as the sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Examples:

Input: n = 5, arr[] = {1,3,5,2,2}
Output: 3 
Explanation: The equilibrium point is at position 3 as the sum of elements before it (1+3) = sum of elements after it (2+2). */

class Solution {

    // arr: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long count1=0,count2=0;
        for(int i=0;i<n;i++){
            count1=count1+arr[i];
        }
        for(int i=0;i<n;i++){
            if((count1-arr[i])==(count2*2)){
                return i+1;
            }
            count2=count2+arr[i];
        }
        return -1;
        
    }
}
