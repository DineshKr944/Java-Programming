package SDET_30;

public class Find_Even_Odd_in_Array {

	public static void main(String[] args) {
		int a[]= {23,20,67,88,6,20};
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println("Even Number="+a[i]);
			}
			else {
				System.out.println("Odd Number="+a[i]);
			}
		}
	}

}
