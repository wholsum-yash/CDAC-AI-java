package PGCPAI;
import java.util.*;
public class SimpleInterest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Principal");
		float p = sc.nextFloat();
		
		System.out.println("Enter the rate of interest");
		float r = sc.nextFloat();
		
		System.out.println("Enter the time ");
		int t = sc.nextInt();
		
		float SI = (p*r*t)/100;
		
		System.out.println("SI:" + " "+ SI);
		System.out.println("Amount:" +" "+ (SI + p) );
		sc.close();
	}
}
