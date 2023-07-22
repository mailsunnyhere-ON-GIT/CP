//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int start=0;
        int end=S.length()-1;
        int pal=0;
        pal=paln(S,start,end);
        return pal;
    }
    int paln(String s,int a,int b)
    {
        if(a>=b)
        return 1;
        
        if(s.charAt(a)==s.charAt(b))
        return paln(s,a+1,b-1);
        else
        return 0;
    }
    
};