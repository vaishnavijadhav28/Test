package com.data.project;

public class OpratorTest {
	public static void main(String[]args) {
		int a=56,b=56,c=78,x=10,v=10;
		System.out.println(a+b);	
		System.out.println(a-b);	
	    System.out.println(a*b);	
        System.out.println(a/b);	
        System.out.println(a%b);//module oprator	

		
        System.out.println(a>b&&b<c);//and oprator	
	    System.out.println(a>b||b<c);//or oprator	
        System.out.println(a!=b);//not oprator	
        System.out.println(a==b);//equility oprator
        
        a+=5;//a=a+5;
        System.out.println(a);
        a-=5;//a=a-5;
        System.out.println(a);
        a*=2;//a=a*2;
        System.out.println(a);
        a/=4;//a=a/4
        System.out.println(a);
        
        System.out.println(a&b);//bitwise and oprator
        System.out.println(a|b);//bitwise or oprator
        System.out.println(a<<b);//right shift oprator
        System.out.println(a>>b);//left shift oprator
        
        System.out.println(++x);//10
        System.out.println(x);
        
        System.out.println(--x);
        System.out.println(x--);
        
      
        System.out.println(v++ + ++v - v--);
        
        int y=(20>30)?20:30;
        System.out.println(y);
        
        String s=(20<30)?"java":"c++";
        System.out.println(s);
        	

		}

}
