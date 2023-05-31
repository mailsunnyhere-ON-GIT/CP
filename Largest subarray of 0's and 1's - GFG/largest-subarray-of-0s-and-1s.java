//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.util.HashMap;

class Largest_Subarray
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int a[] = new int[N];
            for (int i = 0; i < N; i++) 
                a[i] = sc.nextInt();
            

            Solution g = new Solution();
            int n = g.maxLen(a, a.length);

            System.out.println(n);

            T--;
        }
    }
}

// } Driver Code Ends





class Solution {
    int maxLen(int[] arr, int N) {
        int result = 0, sum = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0)
                arr[i] = -1;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, -1);
        for (int k = 0; k < N; k++) {
            sum = sum + arr[k];
            if (hm.containsKey(sum)) {
                result = Math.max(result, k - hm.get(sum));
            } else {
                hm.put(sum, k);
            }
        }
        return result;
    }
}

