import java.util.Scanner;

public class AvgNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;
        int number;

        System.out.println("Enter the numbers:");

        do {
            number = scanner.nextInt();
            sum += number;
            count++;
        } while (count < n);

        double average = (double) sum / n;
        System.out.println("The average is: " + average);

        scanner.close();
    }
}
