/*Given a array of length N, at each step it is reduced by 1 element. In the first step the maximum element would be removed, while in the second step minimum element of the remaining array would be removed, in the third step again the maximum and so on. Continue this till the array contains only 1 element. And find the final element remaining in the array.

Example 1:

Input:
N = 7
A[] = {7, 8, 3, 4, 2, 9, 5}
Ouput:
5
Explanation:
In first step '9' would be removed, in 2nd step
'2' will be removed, in third step '8' will be
removed and so on. So the last remaining
element would be '5'.*/

class Solution {
    
    public long leftElement(long arr[], long n)
    {
        Arrays.sort(arr);
        int num=(int)n/2;
        if(n%2==0){
            return arr[num-1];
        }
        return arr[num];
    }
}
