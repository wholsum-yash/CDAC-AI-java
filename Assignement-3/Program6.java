import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] printed = new boolean[n];
        boolean foundDuplicate = false;

        System.out.print("Duplicate elements: ");

        for (int i = 0; i < n; i++) {
            if (printed[i]) {
                continue;
            }

            boolean isDuplicate = false;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    printed[j] = true;
                }
            }

            if (isDuplicate) {
                System.out.print(arr[i] + " ");
                printed[i] = true;
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.print("None");
        }

        System.out.println();
        sc.close();
    }
}
