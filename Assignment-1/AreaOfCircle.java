package PGCPAI;
import java.util.*;

public class AreaOfCircle {
	public static void main(String[] args) {
		System.out.println("Enter the radius of circle:");
		Scanner sc= new Scanner(System.in);
		float radius=sc.nextFloat();
		System.out.println("Area of the Cicle:"+(3.14159*radius*radius));
		System.out.println("Circumference of the Cicle:"+(2*3.14159*radius));
		sc.close();
		
	}
}
