package org.test.dynamic;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class SimpleInterest {
	public static void main(String[]args) throws IOException,NumberFormatException
	{
		double i,p,t,r;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		System.out.println("enter the principle amount");
		p=Double.parseDouble(ob.readLine());
		System.out.println("enter the rate of interest");
		r=Double.parseDouble(ob.readLine());
		System.out.println("enter the time");
		t=Double.parseDouble(ob.readLine());
		i=(p*t*r)/100;
		System.out.println("Interest="+i);

	}
}
