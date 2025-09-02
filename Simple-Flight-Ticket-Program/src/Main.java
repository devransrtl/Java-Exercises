import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km, age, type;
        double price;

        System.out.print("Enter the Distance (km): ");
        km = scan.nextInt();

        System.out.print("Enter your age: ");
        age = scan.nextInt();

        System.out.print("Select Trip Type (1 = One way, 2 = Round Trip): ");
        type = scan.nextInt();

        if (km < 0 || age < 0 || (type != 1 && type != 2)) {
            System.out.println("You have logged in invalidly. Please try again.");
            return;
        }

        double unitPrice = 10.0;
        double ageDiscount = 1.0;

        if (age < 12)
            ageDiscount = 0.5;
        else if (age <= 24)
            ageDiscount = 0.9;
        else if (age >= 65)
            ageDiscount = 0.7;

        price = km * unitPrice * ageDiscount;

        if (type == 2) {
            price *= 0.9;  // round trip discount
            price *= 2;
        }

        System.out.println("Total amount you need to pay: " + price + "$");
    }
}