//Leetcode ref: https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1440/

class Solution {
    
    //helper called l/2 times where l is length of string.
    public void helper(char [] s, int i, int l)
    {
        if(i<l/2)
            return;
        else{
            char t=s[i]; //O(1)
            s[i]=s[l-i-1]; //O(1)
            s[l-i-1]=t;//O(1)
            i=i-1;//O(1)
            helper(s, i,l);
            
        }
    }
    // time complexity of helper: l/2 * O(1) = O(l/2)~=O(l)
        
    public void reverseString(char[] s) {
        
        helper(s,s.length-1, s.length);
        
    }
}

TODO: 1. update space complexity of helper for recursion. 2. Compare recursion method with iterative method in terms of space and complexity analysis.
