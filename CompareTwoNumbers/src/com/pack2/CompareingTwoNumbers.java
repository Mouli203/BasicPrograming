package com.pack2;

import java.util.Scanner;

/*Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39                                                                          
25 < 39                                                                           
25 <= 39
*/
public class CompareingTwoNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input first integer:");
		int number1=sc.nextInt();
		System.out.println("Input second integer:");
		int number2=sc.nextInt();
		if(number1 == number2)
		{
			System.out.println(number1+" == "+number2);
		}
		if(number1 != number2)
		{
			System.out.println(number1+" != "+number2);
		}
		if(number1 < number2)
		{
			System.out.println(number1+" < "+number2);
		}
	    if(number1 > number2)
		{
			System.out.println(number1+" > "+number2);
		}
	    if(number1 >= number2)
		{
			System.out.println(number1+" >= "+number2);
		}
		if(number1 <= number2)
		{
			System.out.println(number1+" <= "+number2);
		}
		sc.close();
	}
	
	/*Output
	 Input first integer:
25
Input second integer:
39
25 != 39
25 < 39
25 <= 39
	 */

}
