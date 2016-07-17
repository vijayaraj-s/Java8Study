package com.vijay.study;

public class LambdaStudy {
	
	interface Print{
		void console(String s);
	}
	
	public static void main(String[] args) {
		
		Print p = (s) -> {System.out.println(s);};
		p.console("Dhiviji");	
		
	}

}
