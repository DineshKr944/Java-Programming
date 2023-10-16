package Code;

public class Palindrome {

	static boolean checkPalindrome(String str)
	{
		int len = str.length();
		for(int i=0;i<len/2;i++)
		{
			if (str.charAt(i)!=str.charAt(len-i-1))
				return false;
		}
		return true;
	}
	public static void main(String[] args)
	{
		String st ="2002";
		if (checkPalindrome(st)==true)
			System.out.print("It's Palindrome Nummber");
		else
			System.out.print("It's Not Palindrome Number");
	}
}