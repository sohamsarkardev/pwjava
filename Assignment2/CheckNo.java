import java.util.Scanner;

public class CheckNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no: ");
        int no = sc.nextInt();

        if (no > 0) {
            System.out.println("The no " +no+ " is positive " );
        } else if (no < 0) {
            System.out.println("The no " +no+ " is negative" +no);
        } else {
            System.out.println("The no is zero");
        }

        sc.close();
    }
}
