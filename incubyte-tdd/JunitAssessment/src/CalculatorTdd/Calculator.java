package CalculatorTdd;



public class Calculator {
	
	public static int add(String str) {
		
		if(str.isEmpty()) return 0;
		else if(str.contains(",") || str.contains("\n")){
			String [] tokens = str.split(",|\n");
			int l = tokens.length;
			int i=0;
			int sum=0;
			while(i<l) {
			sum += Integer.parseInt(tokens[i++]) ;
			}
			return sum;
		}
		else {
			return Integer.parseInt(str);
		}
	}
}
