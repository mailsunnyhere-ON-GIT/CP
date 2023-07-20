//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
			
            Solution ob = new Solution();
            int ans  = ob.trailingZeroes(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static int trailingZeroes(int N){
        // Write your code here
        // number is trailing zeros is directly proportional to no of 5's in a factorial
        //25 has 2 five
        //125 has 3 fives  and so o
        //so we have to keep them in mind too
        
        int res=0;
        for(int i=5;i<=N;i=i*5)
        {
            res=res+N/i;
        }
        return res;
    }
}