//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int num){
        // code here
         int count = 0;
        
        // Create a copy of num
        int kaam = num;
        
        // Loop until kaam is equal to 0
        while (kaam != 0) {
            // Extract the last digit of kaam
            int k = kaam % 10;
            
            // Check if k is not equal to 0
            if (k != 0) {
                // Check if num is evenly divisible by k
                if (num % k == 0) {
                    // Increment count
                    count++;
                }
            }
            
            // Update kaam by dividing it by 10
            kaam /= 10;
        }
        
        // Return count
        return count;
    }
}