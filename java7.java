import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class GymMembership {
    String memberName;
    int age;
    int months;
    double fee;

    GymMembership(String name, int age, int months) throws InvalidAgeException {
        this.memberName = name;
        this.age = age;
        this.months = months;

        if (age < 18) {
            throw new InvalidAgeException("Membership is allowed only for adults (age 18+).");
        }

        if (months < 1 || months > 12) {
            throw new IllegalArgumentException("Membership duration must be between 1 and 12 months.");
        }

        this.fee = months * 1000;
    }

    void displayDetails() {
        System.out.println("\n ====== Gym Membership Details ======");
        System.out.println("Member Name         : " + memberName);
        System.out.println("Age                 : " + age);
        System.out.println("Membership Duration : " + months + " months");
        System.out.println("Total Membership Fee: Rs. " + fee);
        System.out.println("Status              : Active");
    }
}

public class java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("=== GYM MEMBERSHIP REGISTRATION SYSTEM ===");
            
            System.out.print("Enter member name: ");
            String name = sc.nextLine();

            System.out.print("Enter member age: ");
            int age = sc.nextInt();

            System.out.print("Enter membership duration (1-12 months): ");
            int months = sc.nextInt();

            GymMembership member = new GymMembership(name, age, months);
            member.displayDetails();

        } catch (InvalidAgeException e) {
            System.out.println("Registration Failed: " + e.getMessage());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Registration Failed: Input Error -> " + e.getMessage());
            
        } finally {
            sc.close();
            System.out.println("\nThank you for using the Gym Membership System.");
        }
    }
}