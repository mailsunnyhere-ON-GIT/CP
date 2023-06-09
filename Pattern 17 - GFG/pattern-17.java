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
            for(int k=n-i;k>0;k--)
            System.out.print(" ");
            
            int counter=i;
            int x=65;
            for(int m=1;m<(i*2);m++)
            {
                //System.out.print(m);
                System.out.print((char)x);
                counter--;
                x=(counter>0)?x+1:x-1;
                 
            }
            System.out.println();
            
            
        }
    }
}