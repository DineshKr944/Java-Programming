package Javaprectice;

public class Palindrom_string {

	public static void main(String[] args) {
		String str="mom";
		String ch="";
		for(int i=str.length()-1;i>=0;i--)
		{
			 ch = ch+str.charAt(i);
		}
		if(ch.equals(str)) {
			System.out.println("it is a palindrom String");
		}
		else {
			System.out.println("it is not a palindrom String");
		}
	}
}
