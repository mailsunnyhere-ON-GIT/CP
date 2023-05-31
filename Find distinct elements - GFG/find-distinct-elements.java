//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            int M[][] = new int[N][N];
            String arr[] = in.readLine().trim().split("\\s+");
            for(int i = 0;i < N*N; i++)
                M[i/N][i%N] = Integer.parseInt(arr[i]);
                
            Solution ob = new Solution();
            System.out.println(ob.distinct(M, N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int distinct(int M[][], int N) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(M[0][i]);
        }
        for (int k = 1; k < N; k++) {
            HashSet<Integer> temp = new HashSet<>();
            for (int k1 = 0; k1 < N; k1++) {
                if (set.contains(M[k][k1])) {
                    temp.add(M[k][k1]);
                }
            }
            set = temp;
        }
        return set.size();
    }
}


