package com.java.conditional_programs;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value no 1:");
		int no1=s.nextInt();
		System.out.println("Enter value no 2:");
		int no2=s.nextInt();
		System.out.println("Enter value symbol(+,-,/,*):");
		String sym=s.next();
		int result;
		
		switch(sym) {
		case "+":result=no1+no2;
		   System.out.println("Addition is="+result);
		   break;
		case "-":result=no1-no2;
		   System.out.println("Substraction is="+result);
		   break;
		case "/":result=no1/no2;
		   System.out.println("Division is="+result);
		   break;
		case "*":result=no1*no2;
		   System.out.println("Multiplication is="+result);
		   break;
		   
		   default:System.out.println("Invalid");
		}

	}

}
