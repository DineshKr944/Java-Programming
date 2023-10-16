package SDET_30;

public class ReverseString01 {

	public static void main(String[] args) {
		String str="I am Dinesh Kumar";
		String[] a=str.split(" ");
		for(int i=0;i<a.length;i++) {
			String s=a[i];
			for(int j=s.length()-1;j>=0;j--){
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
