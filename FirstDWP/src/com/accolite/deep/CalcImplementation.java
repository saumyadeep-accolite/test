package com.accolite.deep;

import java.util.Scanner;

public class CalcImplementation implements Calculator {

	@Override
	public Integer add(Integer a, Integer b) {
		return a + b;
	}

	@Override
	public Integer sub(Integer a, Integer b) {
		return a-b;
	}

	@Override
	public Long mul(Integer a, Integer b) {
		return (long) (a*b);
	}

	@Override
	public Integer div(Integer a, Integer b) throws ArithmeticException {
		return a/b;
	}

	
	public static void main(String[] args) {
		Calculator calculator = new CalcImplementation();
		Integer a,b,choice;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a: ");
		a = in.nextInt();
		
		System.out.println("Enter b: ");
		b =in.nextInt();
		
		System.out.println("Choice:\n1. Add\n2. Sub\n3. Mul\n4. Div \n");
		choice = in.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println(calculator.add(a, b));
			break;
		case 2:
			System.out.println(calculator.sub(a, b));
			break;
		case 3:
			System.out.println(calculator.mul(a, b));
			break;
		case 4:
			try{
				System.out.println(calculator.div(a, b));
			}
			catch(ArithmeticException e){
				System.out.println("Cannot divide by 0");
			}
			break;

		default:
			break;
		}
		in.close();
	}
}
