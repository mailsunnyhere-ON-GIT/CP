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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
        int top=0;
        int left=0;
        int right=0;
        int down=0;
        
        for(int i=0;i<n*2-1;i++)
        {
            for(int j=0;j<n*2-1;j++){
                top=i;
                down=(n*2-1)-i-1;
                left=j;
                right=(n*2-1)-j-1;
                /* show the trick is to just print the minimum distance from boder in
                each case 
                
               it will look like this 
               
               0 0 0 0 0 0 0
               0 1 1 1 1 1 0
               0 1 2 2 2 1 0
               0 1 2 3 2 1 0
               0 1 2 2 2 1 0
               0 1 1 1 1 1 0
               0 0 0 0 0 0 0
               
               
               this is the standered matrix for this question
               
               just figure out way to get to answer , in this case it is n-(the place)*/
                
        
                
                int result = Math.min(Math.min(right, left), Math.min(top, down));
                System.out.print(n-result+" ");
            }
             System.out.println();}
     
    }
}