//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}




// } Driver Code Ends


//User function Template for Java
class Solution {
    public static int posOfRightMostDiffBit(int m, int n) {
        // If m and n are equal, return -1
        if (m == n) {
            return -1;
        }
        int count = 1;
        // Using XOR to find the rightmost different bit
        int xor = m ^ n;
        // Checking each bit one by one
        while ((xor & 1) == 0) {
            count++;
            xor >>= 1;
        }
        return count;
    }
}



