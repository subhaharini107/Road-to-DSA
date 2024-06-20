/* Given a number positive number N, find the value of f0 + f1 + f2 +... + fN where fi indicates ith Fibonacci number.
Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
Since the answer can be very large, the answer takes modulo with 1000000007 and returned.

Example 1:

Input:
N = 3
Output:
4
Explanation:
0 + 1 + 1 + 2  = 4
*/
class Solution {
    static long fibSum(long N) {
        long num1=0,num2=1,num3=0,num4=1;
        if(N==0){
            return 0;
        }
        else{
            for(int i=1;i<N;i++){
                num3=(num1+num2) % 1000000007 ;
                num4=num3+num4;
                num1=num2;
                num2=num3;
            }
            return num4 % 1000000007;
        }
    }
}

          
