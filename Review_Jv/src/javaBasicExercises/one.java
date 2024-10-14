package javaBasicExercises;

import java.util.Scanner;

public class one {
	public static void main(String arg[]) {
		Scanner myObj = new Scanner(System.in);
//1. Write a Java program to print 'Hello' on screen and your name on a separate line.
		/*
		 * System.out.println("Hello");
		 * System.out.println("Le Manh Duy");
		 */
//2. Write a Java program to print the sum of two numbers.
		/*
		 * System.out.println(74 + 36);
		 */
//3. Write a Java program to divide two numbers and print them on the screen.
		/*
		 * System.out.println(50/15);
		 */	
		/*
 * 4. Write a Java program to print the results of the following operations.
 * Test Data: 
 * a. -5 + 8 * 6
 *  b. (55+9) % 9
 *   c. 20 + -3*5 / 8 
 *   d. 5 + 15 / 3 * 2 - 8 % 3
 */

		/* System.out.println(-5 + 8 * 6);//43 System.out.println((55 + 9) % 9);//1
		 * System.out.println(20 + -3*5 / 8);//19 System.out.println(5 + 15 / 3 * 2 - 8
		 * % 3);//13
		 */
/*
 * 5.Write a Java program that takes two numbers as input and displays the product
 * of two numbers. 
 * Test Data: Input first number: 25
 *  Input second number: 5
 */	
		/*
		 * System.out.print("Input first number: "); int firstNumber =
		 * Integer.parseInt(myObj.nextLine());
		 * System.out.print("Input second number: "); int secondNumber =
		 * Integer.parseInt(myObj.nextLine());
		 * 
		 * System.out.println("Result :" + (firstNumber * secondNumber));
		 */
/*
 * 6. Write a Java program to print the sum (addition), multiply, subtract,
 * divide and remainder of two numbers. 
 * Test Data: 
 * Input first number: 125 Input
 * second number: 24
 */
		/*
		 * int a; int b; System.out.println("Input first number :"); a =
		 * Integer.parseInt(myObj.nextLine());
		 * System.out.println("Input second number :"); b =
		 * Integer.parseInt(myObj.nextLine()); System.out.println("Sum :" + (a + b));
		 * System.out.println("Multiply :" + (a * b)); System.out.println("Substract :"
		 * + (a - b)); System.out.println("Divide :" + (a / b));
		 * System.out.println("Remainder :" + (a % b));
		 */
	
/*
 * 7. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10. 
 * Test Data: Input a number: 8
 */
		/*
		 * System.out.print("Input your number you want: "); int a = myObj.nextInt();
		 * 
		 * System.out.println("Multiplication table up to 10 :");
		 * 
		 * for(int i = 1 ; i <= 10 ; i++) { System.out.println(a + " x " + i + " = " +
		 * (a * i)); }
		 */
/*
 * 8. Write a Java program to display the following pattern. Sample Pattern :
 * J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 */
	System.out.println("   J    a   v     v  a ");
	System.out.println("   J   a a   v   v  a a");
	System.out.println("J  J  aaaaa   V V  aaaaa ");
	System.out.println(" JJ  a     a   V  a     a");
	
	}
}
