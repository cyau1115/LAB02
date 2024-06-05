import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Input: ");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 == num2) {
                System.out.println("兩個數相等");
            } else if (num1 < num2) {
                System.out.println("第一個數較小");
            } else {
                System.out.println("第二個數較小");
            }
        }
    }
}