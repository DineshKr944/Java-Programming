package SDET_30;

public class Remove_whitespace_in_String {

	public static void main(String[] args) {
		String str="I am Dinesh Singh";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				System.out.print(ch);
			}
		}
	}

}
