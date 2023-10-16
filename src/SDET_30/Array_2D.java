package SDET_30;

public class Array_2D {

	public static void main(String[] args) {
		int a[][]= {{2,3,4},{3,2,1},{4,5,6}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
