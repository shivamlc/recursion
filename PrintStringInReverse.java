// Recursion principle example 1
// Leetcode ref: https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1439/
public class PrintStringInReverse {
	
	
	
	static void printReverse(char[] s, int index)
	{
		if(index==-1)
			return;
		else {
			System.out.println(s[index]);
			index=index-1;
			printReverse(s,index);
		}
	}
	
	
	public static void main(String args[])
	{
		String s="TEST STRING";
		char arr[]=s.toCharArray();
		printReverse(arr,arr.length-1);
	}

}
