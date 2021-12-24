package org.test.dynamic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {
	public static void main(String[]args)throws IOException,NumberFormatException
	
	{
	double pi=3.14,r,a,p;
	InputStreamReader in=new InputStreamReader(System.in);
	BufferedReader ob=new BufferedReader(in);
	System.out.println("enter the radius");
	r=Double.parseDouble(ob.readLine());
	a=pi*r*r;
	p=2*pi*r;
	System.out.println("area of circle="+a);
	System.out.println("perimeter of circle="+p);
	
	
	}
}
