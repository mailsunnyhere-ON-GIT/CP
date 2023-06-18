//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java


import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


 
 
class Solution
{ 
    // Method to calculate distinct sub-array 
    static int countDistinctSubarray(int arr[], int n) 
    { 
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
         
        int k = set.size();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        int start = 0;
        int end = 0;
        
        while (end < n) {
            hm.put(arr[end], hm.getOrDefault(arr[end], 0) + 1);
            
            while (hm.size() == k) {
                count += n - end;
                hm.put(arr[start], hm.get(arr[start]) - 1);
                if (hm.get(arr[start]) == 0) {
                    hm.remove(arr[start]);
                }
                start++;
            }
            
            end++;
        }
        
        return count;
    }
}


//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		// looping through all testcases
		while(testcases-- > 0){
		    int n=Integer.parseInt(br.readLine());
		    String line1 = br.readLine();
		    String[] a1 = line1.trim().split("\\s+");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=Integer.parseInt(a1[i]);
		    }
		    Solution ob=new Solution();
		    int ans=ob.countDistinctSubarray(a,n);
		    System.out.println(ans);
		    
		}
	}
}

// } Driver Code Ends