/*Given an array of size n-1 such that it only contains distinct integers in the range of 1 to n. Return the missing element.

Examples:

Input: n = 5, arr[] = {1,2,3,5}
Output: 4
Explanation : All the numbers from 1 to 5 are present except 4.*/

class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        int total=0;
        int value=(int)((n*(n+1))/2);
        for(int i=0;i<arr.length;i++){
           total=total+arr[i]; 
        }
        return Math.abs(total-value);
    }
}
