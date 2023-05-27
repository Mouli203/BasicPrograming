package com.pack1;

import java.util.Scanner;
/*
 Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722s 
 */
public class Polygon 
{
	public static void main(String []Args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the number of sides on the polygon: ");
		double n=sc.nextInt();
		System.out.println("Input the length of one of the sides: ");
		double s=sc.nextInt();
		double area=(n*(s*s))/(4*Math.tan(Math.PI/n));
		System.out.println("The area of hexagon is "+area);
		sc.close();
	}

}
