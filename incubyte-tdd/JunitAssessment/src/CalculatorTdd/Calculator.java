package CalculatorTdd;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
	
	public static int add(String str) {
		
		if(str.isEmpty()) return 0;
		
		else if(str.startsWith("//")) {
			char delimeter = str.charAt(2);
			str=str.substring(4);
			return makeTokensAndAdd(str, delimeter);
		}
		else if(str.contains(",") || str.contains("\n")){
			return makeTokensAndAdd(str, ',');
		}
		
		else {
			return Integer.parseInt(str);
		}
	}
	
	public static int makeTokensAndAdd(String str, char delimeter) {
		String [] tokens = str.split(delimeter + "|\n");
		int l = tokens.length;
		int i=0;
		int sum=0;
		List<Integer> listNegative = new ArrayList<>();
		while(i<l) {
		if(Integer.parseInt(tokens[i])<0) listNegative.add(Integer.parseInt(tokens[i]));
		sum += Integer.parseInt(tokens[i++]) ;
		}
		if (listNegative.size()>0) {
			throw new RuntimeException("negatives not allowed : " + listNegative);
		}
		else
		return sum;
	}
	
}
