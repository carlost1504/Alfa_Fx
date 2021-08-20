package model;

public class Operations {
	
	public static int multiplication(int numerator,int denominator) {
		int multi;
		int n1=numerator;
		int n2=denominator;
		multi=n1*n2;
		return multi;
	}
	
	public static int division(int numerator,int denominator) {
		int divis;
		int n1=numerator;
		int n2=denominator;
		if (n2!=0) {
			divis=numerator/denominator;
		}else {
			divis=0;
		}
		return divis;
	}
}
