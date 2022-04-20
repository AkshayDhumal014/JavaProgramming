package com.java.conditional_programs;

public class GreaterThree1 {

	public static void main(String[] args) {
	     int a=112,b=125,c=68, d=145;
	     if(a>b && a>c && a>d) {
	    	 System.out.println("a is greater");
	     }
	     else if(b>a && b>c && b>d ) {
	    	 System.out.println("b is greater");
	     }
	     else if(c>a && c>b && c>d ) {
	    	 System.out.println("c is greater");
	     }
	     else {
	    	 System.out.println("d is gretaer");
	     }
	}
}
