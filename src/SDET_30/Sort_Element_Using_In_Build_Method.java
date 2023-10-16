package SDET_30;

import java.util.Arrays;

public class Sort_Element_Using_In_Build_Method {

	public static void main(String[] args) {
		int a[]= {26,87,65,78,32,12,90,11};
		System.out.println("Array Befor Sorting"+Arrays.toString(a));
	    Arrays.parallelSort(a);
	    System.out.println("Array After Sorting"+Arrays.toString(a));
	}

}
