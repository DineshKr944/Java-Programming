package SDET_30;

public class ReverseString {

	public static void main(String[] args) {
		String str="Dinesh";
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			System.out.print(ch);
		}
	}
}
