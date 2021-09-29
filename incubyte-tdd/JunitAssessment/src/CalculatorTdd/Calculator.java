package CalculatorTdd;

import java.util.StringTokenizer;

public class Calculator {
	
	public static int add(String str) {
		
		if(str.isEmpty()) return 0;
		else if(str.contains(",")){
			String [] tokens = str.split(",");
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[1]);
			return a+b;
		}
		else {
			return Integer.parseInt(str);
		}
	}
}
