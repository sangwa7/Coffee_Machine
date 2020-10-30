//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var firstName = scanner.next();
        scanner.nextInt();
        scanner.next();
        scanner.nextInt();
        var cuisinePreference = scanner.next();

        System.out.print("The form for " + firstName + " is completed. We will contact you if we need a chef that cooks " + cuisinePreference + " dishes.");


        // put your code here
    }
}