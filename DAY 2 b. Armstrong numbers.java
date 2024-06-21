/*You are given a 3-digit number n, Find whether it is an Armstrong number or not.

An Armstrong number of three digits is a number such that the sum of the cubes of its digits is equal to the number itself. 
371 is an Armstrong number since 33 + 73 + 13 = 371. 

Note: Return "true" if it is an Armstrong number else return "false".

Examples

Input: n = 153
Output: true
Explanation: 153 is an Armstrong number since 13 + 53 + 33 = 153. Hence answer is "true".*/

class Solution {
    static String armstrongNumber(int n) {
        int num=n,rem,sum=0;
        while(num>0){
            rem=num%10;
            sum=sum+(int)Math.pow(rem,3);
            num=num/10;
        }
        if(sum==n){
            return "true";
        }
        return "false";
    }
}
