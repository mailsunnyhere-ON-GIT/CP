//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
         HashMap<Character,Integer> hm=new HashMap<>();
         for(int i=0;i<line.length();i++)
         {
             if(hm.containsKey(line.charAt(i)))
             {
                 int k=hm.get(line.charAt(i));
                 k++;
                 hm.put(line.charAt(i),k);
             }
             else
             hm.put(line.charAt(i),1);
         }
         
         //System.out.println(hm);
         
         
         
         char ret=line.charAt(0);
         int max=hm.get(line.charAt(0));
         for(Character l:hm.keySet())
         {
             if(max<hm.get(l)){
             max=hm.get(l);
             //System.out.println(l);
             
                 ret=l;
             }
             
             else if(max==hm.get(l))
             {
                 ret=(ret<l)?ret:l;
             }
         }
         
         
         return ret;
         
         
    }
    
}