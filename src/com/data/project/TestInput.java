package com.data.project;
import java.util.Scanner;

public class TestInput {
	public static void main(String[]args) {
		
		Scanner ob=new Scanner(System.in);
		long a,b;
		float c,d;
		String name;
		System.out.println("enter the value of a=");
		a=ob.nextLong();
		System.out.println("enter the value of b=");
		b=ob.nextLong();
		
		System.out.println("enter the value of c=");
		c=ob.nextLong();
		System.out.println("enter the value of d=");
		d=ob.nextLong();
		System.out.println("enter the  name=");
		name=ob.next();
		
		System.out.println("Addition="+(a+b));
		System.out.println("Addition="+(c+d));
		System.out.println(name);

		ob.close();
		
	}

}
