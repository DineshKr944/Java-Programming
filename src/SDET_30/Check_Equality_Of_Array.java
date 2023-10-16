package SDET_30;

import java.util.Arrays;

public class Check_Equality_Of_Array {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		System.out.println("By using Equals Method");
		boolean Eql = Arrays.equals(a,b);
		if(Eql==true) {
			System.out.println("Array are equals");
		}
		else {
			System.out.println("Array are not equals");
		}
		System.out.println("By using == oprater");
		if(a==b) {
			
			System.out.println("Array are equals");
		}
		else {
			System.out.println("Array are not equals");
		}
	}
}
