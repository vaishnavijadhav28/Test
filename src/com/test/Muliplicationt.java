package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Muliplicationt {
	public static void main(String[]args) throws NumberFormatException ,IOException  {
		int a,b;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the value of a");
		a=Integer.parseInt(ob.readLine());
		System.out.println("enter the value of b");
		b=Integer.parseInt(ob.readLine());
		System.out.println(a*b);
	}

}
