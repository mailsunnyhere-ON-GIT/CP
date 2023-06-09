//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int k=0;k<i*2;k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<n-i;l++)
            {
                System.out.print("*");
            }
            
              System.out.println();
            
            
        }
         for(int i=n-1;i>=0;i--)
        {
            for(int j=n-1;j>=i;j--)
            {
                System.out.print("*");
            }
            for(int k=0;k<i*2;k++)
            {
                System.out.print(" ");
            }
            for(int l=n-1;l>=i;l--)
            {
                System.out.print("*");
            }
            
              System.out.println();
            
            
        }
        
        
            
              
            
    }
}