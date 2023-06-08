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
        {    int count=1;
            for(int j=0;j<i;j++)
            {
                System.out.print(count+" ");
                count++;
            }
             int x=count-1;
            for(int ii=count;ii<(n*2)-count+2;ii++){
               System.out.print("  "); 
            }
           
            for(int l=1;l<count;l++)
            {
                
                System.out.print(x+" ");
                x--;
            }
            
            
            
            System.out.println();
        }
    }
}