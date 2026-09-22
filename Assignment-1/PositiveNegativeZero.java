package PGCPAI;
import java.util.*;

public class PositiveNegativeZero {
public static void main(String[] args) {
	System.out.println("Enter the number: ");
	Scanner sc = new Scanner(System.in);
	float num= sc.nextFloat();
	if(num==0) {
		System.out.println("Number is zero");
	}
	else if(num<0) {
		System.out.println("Number is negative");
	}
	else {
		System.out.println("Number is positive");
	}
	sc.close();
}
}
