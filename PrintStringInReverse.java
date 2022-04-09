// Recursion principle example 1
// Leetcode ref: https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1439/
public class PrintStringInReverse {
	
	
	//printReverse function called 'n' times where n is length of string
	static void printReverse(char[] s, int index)
	{
		if(index==-1)
			return;
		else {
			//in each function call, SOP called 1 time (O(1))
			System.out.println(s[index]);
			index=index-1;
			printReverse(s,index);
		}
	}
	
	//Time complexity of printReverse is n*O(1)=O(n)
	
	public static void main(String args[])
	{
		String s="TEST STRING";
		char arr[]=s.toCharArray();
		printReverse(arr,arr.length-1);
	}

}
