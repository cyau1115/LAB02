import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Input: ");
            int score = scanner.nextInt();

            if (score >= 90) {
                System.out.println("Your grade is A");
            } else if (score >= 80) {
                System.out.println("Your grade is B");
            } else if (score >= 70) {
                System.out.println("Your grade is C");
            } else if (score >= 60) {
                System.out.println("Your grade is D");
            } else {
                System.out.println("Your grade is F");
            }
        }
    }
}