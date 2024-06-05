import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Input Chinese score: ");
            int chineseScore = scanner.nextInt();

            System.out.print("Input English score: ");
            int englishScore = scanner.nextInt();

            System.out.print("Input Math score: ");
            int mathScore = scanner.nextInt();

            if (chineseScore < 60) {
                System.out.println("Chinese failed.");
            }
            if (englishScore < 60) {
                System.out.println("English failed.");
            }
            if (mathScore < 60) {
                System.out.println("Math failed.");
            }

            if (chineseScore >= 60 && englishScore >= 60 && mathScore >= 60) {
                System.out.println("All Pass.");
            }
        }
    }
}