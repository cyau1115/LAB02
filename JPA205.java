import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter an integer: ");
            int num = scanner.nextInt();

            if (num % 2 == 0 && num % 3 == 0 && num % 6 == 0) {
                System.out.println(num + " is a multiple of 2, 3, and 6.");
            } else if (num % 2 == 0 && num % 3 == 0) {
                System.out.println(num + " is a multiple of 2 and 3.");
            } else if (num % 2 == 0 && num % 6 == 0) {
                System.out.println(num + " is a multiple of 2 and 6.");
            } else if (num % 3 == 0 && num % 6 == 0) {
                System.out.println(num + " is a multiple of 3 and 6.");
            } else if (num % 2 == 0) {
                System.out.println(num + " is a multiple of 2.");
            } else if (num % 3 == 0) {
                System.out.println(num + " is a multiple of 3.");
            } else if (num % 6 == 0) {
                System.out.println(num + " is a multiple of 6.");
            } else {
                System.out.println(num + " is not a multiple of 2, 3, or 6.");
            }
        }
    }
}