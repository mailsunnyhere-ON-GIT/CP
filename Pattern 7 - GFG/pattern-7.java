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
            for(int i=1;i<=n;i++)
            {
               
                for(int k=n-i;0<k;k--)
                {
                    System.out.print(" ");
                }
                int ll=i;
                for(int o=1;o<ll*2;o++){
                 System.out.print("*");}
                System.out.println();
            }
        }
    }