package PGCPAI;
import java.util.*;

public class LagestOfTwoNumbers {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int num1= sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int num2= sc.nextInt();
		if(num1==num2)
		{
			System.out.println("Equal Numbers");
		}
		else if(num1>num2)
		{
			System.out.println("1st Number is greater");
		}
		else
		{
			System.out.println("2nd Number is greater");
		}
	}
}
