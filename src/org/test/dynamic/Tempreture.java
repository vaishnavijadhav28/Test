package org.test.dynamic;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Tempreture {
	public static void main(String[]args)throws IOException,NumberFormatException
	{
		Double c,f;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		System.out.println("enter the fehrenherit");
		f=Double.parseDouble(ob.readLine());
		c=(f-32)*5/9;
		System.out.println("tempreture in celcius="+c);
		
	}

}
