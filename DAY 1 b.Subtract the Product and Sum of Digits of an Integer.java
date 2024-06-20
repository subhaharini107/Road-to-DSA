/* Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 
Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15*/

class Solution {
    public int subtractProductAndSum(int n) {
      int sum=0,mul=1,num=n;
        while(n>0){
          num=n%10;
            mul=mul*num;
            sum=sum+num;
            n=n/10;
      }  
        return mul-sum;  
    }
}
