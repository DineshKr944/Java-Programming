package SDET_30;

import java.util.Scanner;

public class Qustions {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input1: Numbers
	        System.out.print("Enter a series of numbers: ");
	        String input1 = scanner.nextLine();

	        // Input2: Alphabets
	        System.out.print("Enter a series of alphabets: ");
	        String input2 = scanner.nextLine();

	        // Generate the secret key
	        String secretKey = generateSecretKey(input1, input2);

	        // Print the secret key
	        System.out.println("Secret Key: " + secretKey);
	    }

	    private static String generateSecretKey(String input1, String input2) {
	        StringBuilder secretKeyBuilder = new StringBuilder();

	        // Step 1: Find the first even number from Input1
	        int index = 0;
	        int firstEven = 0;
	        while (index < input1.length()) {
	            int digit = Character.getNumericValue(input1.charAt(index));
	            if (digit % 2 == 0) {
	                firstEven = digit;
	                break;
	            }
	            index++;
	        }

	        // Step 2: Append the last alphabet from Input2 to the first secret key
	        secretKeyBuilder.append(firstEven);
	        secretKeyBuilder.append(input2.charAt(input2.length() - 1));

	        // Step 3: Generate the remaining secret key using the algorithm
	        index = 0;
	        boolean isEven = false;
	        while (index < input1.length()) {
	            int digit = Character.getNumericValue(input1.charAt(index));
	            if (isEven) {
	                // Even number, append it to the secret key
	                secretKeyBuilder.append(digit);
	                isEven = false;
	            } else {
	                // Odd number, append it with the corresponding alphabet from Input2
	                if (input2.length() - 2 - index >= 0) {
	                    secretKeyBuilder.append(input2.charAt(input2.length() - 2 - index));
	                }
	                isEven = true;
	            }
	            index++;
	        }

	        return secretKeyBuilder.toString();
	        }
	}