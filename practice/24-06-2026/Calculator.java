/* Que -1 : Implement Basic Calculator */

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.print("Enter the operator : ");
		String oper = sc.next();
		
		
		System.out.print("Result : ");
		if(oper.equals("+")) System.out.println(num1+num2);
		else if(oper.equals("-")) System.out.println(num1-num2);
		else if(oper.equals("*")) System.out.println(num1*num2);
		else if(oper.equals("/")) System.out.println(num1/num2);
		else System.out.println("Invalid operator");
	}
}