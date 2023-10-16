package SDET_30;

public class MaximumNumber {

	public static void main(String[] args) {
		int[] a= {12,32,45,65,2,1};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>a[0]) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}
