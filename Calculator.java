import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    public void studentMarks() {
        System.out.println("Enter your Marks for each subject: ");

        System.out.println("Physics: ");
        int physics = scanner.nextInt();

        System.out.println("Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.println("Economics: ");
        int economics = scanner.nextInt();

        System.out.println("Business: ");
        int business = scanner.nextInt();

        System.out.println("Information Technology: ");
        int it = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        int totalMarks = physics + chemistry + economics + business + it;
        int averagePercentage = totalMarks / 5;

        System.out.println("Average percentage: " + averagePercentage);
    }
}
