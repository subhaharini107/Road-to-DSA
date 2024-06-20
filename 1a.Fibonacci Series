//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
// } Driver Code Ends
// User function Template for Java
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
//{ Driver Code Starts.
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long N = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends
