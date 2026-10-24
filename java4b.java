import java.util.Scanner;

class GymMember {
    int id;
    String name;

    GymMember(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void displayMember() {
        System.out.println("\n ====== Member Details ======");
        System.out.println("Member ID   : " + id);
        System.out.println("Member Name : " + name);
    }
}

class ActiveMember extends GymMember {
    String plan;

    ActiveMember(int id, String name, String plan) {
        super(id, name); 
        this.plan = plan;
    }

    @Override
    void displayMember() {
        super.displayMember();
        System.out.println("Plan        : " + plan);
    }
}

class PremiumMember extends ActiveMember {
    String trainer;

    PremiumMember(int id, String name, String plan, String trainer) {
        super(id, name, plan);
        this.trainer = trainer;
    }

    @Override
    void displayMember() {
        super.displayMember();
        System.out.println("Trainer     : " + trainer);
    }
}

public class java4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Member Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Membership Plan: ");
        String plan = sc.nextLine();

        System.out.print("Enter Trainer: ");
        String trainer = sc.nextLine();

        PremiumMember p = new PremiumMember(id, name, plan, trainer);
        
        p.displayMember();
        
        sc.close();
    }
}