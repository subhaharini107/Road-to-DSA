class Solution {
    public int missingNumber(int[] nums) {
	    int i=0,index;
	    while(i<nums.length){
            index=nums[i];
	       if(nums[i]<nums.length && nums[i]!=nums[index]){
	           swap(nums,i,index);
	       }
	       else{
	           i++;
	       }
	    }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j){
                return j;
            }
        }
        return nums.length;
    }
	void swap(int []arr,int first,int last){
	    int temp=arr[first];
	    arr[first]=arr[last];
	    arr[last]=temp;
	}
}
