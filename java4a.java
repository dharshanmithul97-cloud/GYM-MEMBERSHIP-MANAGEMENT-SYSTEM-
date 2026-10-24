import java.util.Scanner;

class GymMember {
    int id;
    String name;
    String plan;

    GymMember(int id, String name, String plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    void displayMember() {
        System.out.println("\n ==== Member Details ==== ");
        System.out.println("Member ID : " + id);
        System.out.println("Member Name : " + name);
        System.out.println("Plan: " + plan);
    }
}

class PremiumMember extends GymMember {
    String trainer;

    PremiumMember(int id, String name, String plan, String trainer) {
        super(id, name, plan);
        this.trainer = trainer;
    }

    void displayPremium() {
        displayMember();
        System.out.println("Trainer     : " + trainer);
    }
}

public class java4a {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Member ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Membership Plan: ");
        String plan = sc.nextLine();

        System.out.print("Enter Trainer Name: ");
        String trainer = sc.nextLine();

        PremiumMember p = new PremiumMember(id, name, plan, trainer);

        p.displayPremium();
    }
}