package Code;

public class Palindromestring {
	
	static boolean checkPalindrome(String str) {
		int n=str.length();
		String ch="";
		for(int i=n-1;i>=0;i--) {
			 ch=ch+str.charAt(i);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		String st="mom";
		if(checkPalindrome(st)==false)
		System.out.println("It's Palindrome");
		else
			System.out.println("It's not Palindrome");
	}
}
