package CalculatorTdd;



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
		while(i<l) {
		sum += Integer.parseInt(tokens[i++]) ;
		}
		return sum;
	}
	
}
