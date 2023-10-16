package SDET_30;

public class Reverse_Each_Word_In_String {

	public static void main(String[] args) {
		String str="I am Dinesh kumar";
		String rev =" ";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
			}
			else {
				rev=ch+rev;
			}
		}
		System.out.println(rev);
	}
}
