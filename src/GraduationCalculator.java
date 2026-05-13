import java.util.Scanner;

public class GraduationCalculator {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {

                System.out.print("Enter your name: ");
                String name = scanner.nextLine();

                System.out.print("Enter your age: ");
                int age = scanner.nextInt();

                System.out.print("Enter graduation year: ");
                int gradYear = scanner.nextInt();

                int currentYear = 2026;
                int yearsUntilGrad = gradYear - currentYear;

                System.out.println("\nWelcome, " + name + "!");
                System.out.println("You are " + age + " years old.");
                System.out.println("You have " + yearsUntilGrad + " years left until you graduate in " + gradYear + ".");
            }
        }
    }