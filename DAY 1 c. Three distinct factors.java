/* Given a positive integer N. The task is to check whether a number has exactly three distinct factors or not.

Example 1:

Input:
N = 10
Output:
0
Explanation:
10 has 4 factors- 1,2,5 and 10.
So, the Ouput is 0.
*/

class Solution {
    static int hasThreePrimeFac(Long N) {
        // code here
        // code here
        long l = (long)Math.sqrt(N);
        if(isPrime(l) && l*l == N)
            return 1;
        else
            return 0;
    }
    public static boolean isPrime(long n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        if(n % 2 == 0)
            return false;
        
        for(int i = 3;i<=Math.sqrt(n);i+=2){
            if(n%i == 0)
                return false;
        }
    return true;
    }
};
