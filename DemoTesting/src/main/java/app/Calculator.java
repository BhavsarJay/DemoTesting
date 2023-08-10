package app;
import java.lang.*;

public class Calculator {
	CalculatorService service;
	
	public Calculator(CalculatorService service) {
		this.service = service;
	}
	
	public int expo(int...num) {
		int ans=100;
		for (int i = 0; i < num.length; i++) {
			ans = (int)Math.pow(ans, num[i]);
		}
		return ans;
	}
	
	// Description -
	
//	hh
	
	// function to add a list of numbers
	public int add(int...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		return sum;
	}
	
	public double divide(int i, int j) {
		return i/j;
	}
	
	public int getPercentage(int i, int j) {
		return (service.multiply(200, 50))/100;
	}
}
