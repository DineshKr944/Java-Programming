package SDET_30;

public class Count_Word_in_String {

	public static void main(String[] args) {
		String str="I am Dinesh Singh";
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
