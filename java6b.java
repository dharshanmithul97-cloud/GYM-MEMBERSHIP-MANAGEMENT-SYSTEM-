import java.util.Scanner;

interface Membership {
    void membershipDetails();
}

interface Trainer {
    void trainerDetails();
}

class PremiumMember implements Membership, Trainer {
    int id;
    String name;
    String plan;
    String trainerName;

    PremiumMember(int id, String name, String plan, String trainerName) {
        this.id = id;
        this.name = name;
        this.plan = plan;
        this.trainerName = trainerName;
    }

    @Override
    public void membershipDetails() {
        System.out.println("\n ====== Membership Details ======");
        System.out.println("Member ID   : " + id);
        System.out.println("Member Name : " + name);
        System.out.println("Plan        : " + plan);
    }

    @Override
    public void trainerDetails() {
        System.out.println("Trainer Name: " + trainerName);
    }
}

public class java6b {
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
        String trainerName = sc.nextLine();

        PremiumMember p = new PremiumMember(id, name, plan, trainerName);
        
        p.membershipDetails();
        p.trainerDetails();

        sc.close();
    }
}