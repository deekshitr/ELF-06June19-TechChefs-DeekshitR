package com.techchefs.javaapp.lambda.one;

public class Example1 {

	public static void main(String[] args) {
		Sum s = (a,b)->a+b;
		int a1 = s.add(3, 4);
		System.out.println("Sum: "+a1);
		
		StringLength strLen= (str)->str.length();
		int slen = strLen.strLLength("Priyanka");
		System.out.println("String Length: "+slen);
		
		Factorial fact = (num) -> {
			int factNum = 1;
			for(int i=1;i<=num;i++) {
				factNum = factNum*i;
			}
			
			return factNum;
		};
		
		int factNumber = fact.factorial(5);
		System.out.println("Factorial: "+factNumber);
	}

}
