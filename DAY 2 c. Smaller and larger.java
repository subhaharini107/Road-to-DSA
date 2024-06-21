/*Given a sorted array Arr of size N and a value X, find the number of array elements less than or equal to X and elements more than or equal to X. 

Example 1:

Input:
N = 7, X = 0
Arr[] = {1, 2, 8, 10, 11, 12, 19}
Output: 0 7
Explanation: There are no elements less or
equal to 0 and 7 elements greater or equal
to 0.*/

class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        
        int count=0,count1=0;
        int [] ans=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]>=x){
                count++;
            }
            if(arr[i]<=x){
                count1++;
            }
        }
        ans[0]=count1;
        ans[1]=count;
        return ans;
    }
}
