import java.util.Scanner;

public class Main {

    public static String calculateAgeCategory(int age) {
        if (age < 0) {
            return "Invalid"; // Invalid age
        } else if ( age <= 12) {
            return "Child"; // Child
        } else if ( age <= 19) {
            return "Teenager"; // Teenager
        } else if ( age <= 59) {
            return "Adult"; // Adult
        } else {
            return "Senior"; // Senior
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int inputAge = scanner.nextInt();

        String res = calculateAgeCategory(inputAge);
        System.out.println(res);

        scanner.close();
    }
}
