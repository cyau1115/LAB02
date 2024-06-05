import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("請輸入三個整數: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            if (a <= 0 || b <= 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
                System.out.println("不可以構成三角形");
            } else {
                if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                    System.out.println("直角三角形");
                } else if (a * a + b * b < c * c || a * a + c * c < b * b || b * b + c * c < a * a) {
                    System.out.println("鈍角三角形");
                } else {
                    System.out.println("銳角三角形");
                }
            }
        }
    }
}