package Code;

public class ReverseWord {
	public static void main(String []args) {
		String name="I am Dinesh kumar singh";
		for(int i=name.length()-1;i>=0;i--) {
			char str=name.charAt(i);
			System.out.print(str);
		}
	}
}
