package SDET_30;

public class PalindromString {

	public static void main(String[] args) {
		String str="mofm";
		String ch="";
		for(int i=str.length()-1;i>=0;i--) {
			 ch = ch+str.charAt(i);
		}
		if(ch.equals(str)) {
			System.out.println(str+" is Palindrom String");
		}
		else {
			System.out.println(str+" is not Palindrom String");
		}
	}

}
