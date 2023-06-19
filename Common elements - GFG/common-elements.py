#User function Template for python3

class Solution:
    def commonElements(self, A, B, C, n1, n2, n3):
        # Initialize pointers for each array
        i = j = k = 0
        
        result = []
        
        # Iterate until any pointer reaches the end of its array
        while i < n1 and j < n2 and k < n3:
            # If elements are equal, move all pointers and overwrite A[i] with the common element
            if A[i] == B[j] == C[k]:
                # Avoid adding duplicates
                if not result or result[-1] != A[i]:
                    result.append(A[i])
                i += 1
                j += 1
                k += 1
            # Move the pointer with the smallest value
            elif A[i] <= B[j] and A[i] <= C[k]:
                i += 1
            elif B[j] <= A[i] and B[j] <= C[k]:
                j += 1
            else:
                k += 1
        
        # If no common elements found, return an empty array
        if not result:
            return [-1]
        
        return result

#{ 
 # Driver Code Starts
#Initial Template for Python 3


t = int (input ())
for tc in range (t):
    n1, n2, n3 = list(map(int,input().split()))
    A = list(map(int,input().split()))
    B = list(map(int,input().split()))
    C = list(map(int,input().split()))
    
    ob = Solution()
    
    res = ob.commonElements (A, B, C, n1, n2, n3)
    
    if len (res) == 0:
        print (-1)
    else:
        for i in range (len (res)):
            print (res[i], end=" ")
        print ()

# } Driver Code Ends