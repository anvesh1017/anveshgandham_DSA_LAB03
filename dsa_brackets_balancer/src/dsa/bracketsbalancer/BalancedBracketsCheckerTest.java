package dsa.bracketsbalancer;

public class BalancedBracketsCheckerTest {
	
	public static void main(String[] args) {
		
//		test01();
		test02();
//		test03();
	}

	static void test02() {
		
		String bracketsExpression = "[<<]";
		
		Boolean result = testBalancedBracketsChecker(
			bracketsExpression);
		System.out.println(result);		
	}

	static void test01() {
		
		String bracketsExpression = "{[()]}";
		
		Boolean result = testBalancedBracketsChecker(
			bracketsExpression);
		System.out.println(result);		
	}

	static Boolean testBalancedBracketsChecker(
			String bracketsExpression) {
				
		BalancedBracketsChecker checker 
			= new BalancedBracketsChecker(bracketsExpression);
		
		return checker.check();
	}	
	
	static void test03() {
		
		String bracketsExpression = "dbgv";
		
		Boolean result = testBalancedBracketsChecker(
			bracketsExpression);
		System.out.println(result);		
	}



}