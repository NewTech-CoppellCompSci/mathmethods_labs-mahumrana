
package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		// Scan the persons integers.
		System.out.print("Enter a Positive Integer:");
		int Num1 = inKey.nextInt();
		System.out.print("Enter another Positive Integer:");
		int Num2 = inKey.nextInt();
		double ans = Math.pow(Num1, Num2);
		// Take the two numbers and raise one by the other, then print out the answer.
		System.out.println(Num1+"^"+ Num2+ "="+ ans);
	}
	
	
	
	
	public static void problem02() {
		// Scan the persons integers.
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a Positive Integer:");
		double input = inKey.nextDouble();
		double ans = Math.sqrt(input);
		// Produce the answer of the square root after taking the scanned input, and putting it through Math.sqrt
		System.out.println("The Square Root of "+ input + " is "+ ans);
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		// Find the third side of the triangle.
		System.out.print("Length of side A: ");
		// Scan the persons integers.
		double A = inKey.nextDouble();
		System.out.print("Length of side B: ");
		double B = inKey.nextDouble();
		double A2 = Math.pow(A,2);
		double B2 = Math.pow(B,2);
		// To find C, take A2 and add it to B2 to find C. Then take C and squareroot it to find the third side.
		double C  = A2 + B2;
		double C2 = Math.sqrt(C);
		System.out.println("The third side is equal to" + C2);
		

	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		boolean zero = true;
		// Scan the integers the person puts 
		int max = Integer.MIN_VALUE; 
		int min = Integer.MAX_VALUE; 
		int input = 1;
		// sets values for scanned integers
		while(zero) {
			System.out.println("Enter a  Number");
			 input = inKey.nextInt();
			if(input == 0) {
				zero = false;
			}
			// checks to see if provided integer is 0
			max = Math.max(input, max);
			min = Math.min(input, min);
			// sets values
		}
		System.out.println("Max = "+ max);
		System.out.println("Min = "+min);
		// print out final min & max values
	}
}
	
	
	
