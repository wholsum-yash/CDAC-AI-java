package PGCPAI;
import java.util.*;

public class ArithmeticOperator {
	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num1:");
		float num1 = sc.nextFloat();
		
		System.out.println("Enter num2:");
		float num2 = sc.nextFloat();
		
		System.out.println("Addition:" +" "+ (num1 + num2));
		System.out.println("Substraction:" +" "+ (num1 - num2));
		System.out.println("Multiplication:" +" "+(num1 * num2));
		System.out.println("Division:" +" "+(num1 / num2));
		System.out.println("Modulus:" +" "+(num1 % num2));
		
		sc.close();
	}
}
