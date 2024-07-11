/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2*/

class Solution {
    public int searchInsert(int[] nums, int target) {
       int value=search(nums,target);
        return value;
    }
    int search(int num[],int target){
        int start=0;
        int end=num.length-1;
        int mid=0;
        while(start<=end){
        mid=start+(end-start)/2;
        if(num[mid]==target){
            return mid; 
        }
            else if(target<num[mid]){
                end=--mid;
            }
            else{
                start=++mid;
            }
      }
      
        return start;
    }
}
