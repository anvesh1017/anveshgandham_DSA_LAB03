package dsa.bracketsbalancer;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the brackets expression to check:");

		String bracketExpression = input.nextLine();
		
		BalancedBracketsChecker checker 
		= new BalancedBracketsChecker(bracketExpression);
		
		Boolean result = checker.check(); 
		
		System.out.println(result);
	}

}
