import java.util.Scanner;

public class FabNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        int n1= 0;
        int n2 = 1;

        System.out.println("Fibonacci series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(n1+ " ");

            int n3 = n1+ n2;
            n1= n2;
            n2 = n3;
        }

        scanner.close();
    }
}
