//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
	static int maxCandy(int x[], int n) 
	{ 
	    // Your code goes here
	    int start=0;
	    int end=n-1;
	    int ans=0;
	    while(start<end)
	    {
	        
	    if(x[start]<x[end])
	    {
	        
	        int cal=(end-start-1)*x[start];
	        ans=Math.max(cal,ans);
	        start++;
	    }
	    
	     if(x[start]>x[end])
	    {
	        
	        int cal=(end-start-1)*x[end];
	        ans=Math.max(cal,ans);
	        end--;
	    }
	    
	    
	    if(x[start]==x[end])
	    {
	        
	        int cal=(end-start-1)*x[start];
	        ans=Math.max(cal,ans);
	        start++;
	        end--;
	    }}
	    
	    return ans;
	}
}

//{ Driver Code Starts.
class GFG{
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            int height[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                height[i] = sc.nextInt();
            }

            Solution ob = new Solution();
            System.out.println(ob.maxCandy(height,n));
            t--;
        }
	} 
} 


// } Driver Code Ends