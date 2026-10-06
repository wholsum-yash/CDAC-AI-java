import java.util.ArrayList;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        int zeroCount = 0;

        for (int x : arr) {
            if (x > 0) {
                positive.add(x);
            } else if (x < 0) {
                negative.add(x);
            } else {
                zeroCount++;
            }
        }

        System.out.print("Positive numbers: ");
        for (int x : positive) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Negative numbers: ");
        for (int x : negative) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Zero values: " + zeroCount);

        sc.close();
    }
}
