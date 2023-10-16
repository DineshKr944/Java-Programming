package SDET_30;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		Random r=new Random();
		int randNum = r.nextInt(10000);
		System.out.println(randNum);
		
		//System.out.println(Math.random());
	}

}
