import java.util.*;

public class Calculator {
	
		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println(addition(a, b));
		
		System.out.println(subtraction(a, b));
		
		System.out.println(multiplication(a, b));
		
		System.out.println(division(a, b));
		
		System.out.println(modulo(a, b));
	}
	
	public static double addition(double a, double b)
	{
		return a + b;
	}
	
	public static double subtraction(double a, double b)
	{
		return a - b;
	}
	
	public static double multiplication(double a, double b)
	{
		return a * b;
	}
	
	public static double division(double a, double b)
	{
		return a / b;
	}
	
	public static double modulo(double a, double b)
	{
		return a % b;
	}
}
