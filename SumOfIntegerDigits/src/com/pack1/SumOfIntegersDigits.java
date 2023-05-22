package com.pack1;

import java.util.Scanner;
/*Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
*/
public class SumOfIntegersDigits 
{
	public static void main(String[] args)
	{
		int number1,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input an integer:");
		 number1=sc.nextInt();
		while(number1 != 0)
		{
			sum=sum+number1%10;
			number1=number1/10;
		}
		System.out.println("The sum of the digits is: "+sum);
		sc.close();
	}

}
