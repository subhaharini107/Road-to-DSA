/*Given an array arr of n positive integers, your task is to find all the leaders in the array. An element of the array is considered a leader if it is greater than all the elements on its right side or if it is equal to the maximum element on its right side. The rightmost element is always a leader.

Examples

Input: n = 6, arr[] = {16,17,4,3,5,2}
Output: 17 5 2
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.*/

class Solution {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>=arr[j]){
                    flag=true;
                }
                else{
                    flag=false;
                    break;
                }
            }
            if (flag == true) {
                list.add(arr[i]);
                flag = false;
            }
        }
        list.add(arr[arr.length - 1]);
        return list;
    }
}
