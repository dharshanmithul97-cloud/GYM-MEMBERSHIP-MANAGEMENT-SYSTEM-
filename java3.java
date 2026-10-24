import java.util.Scanner;

class GymMember {
    private int id;
    private String name;
    private String plan;
    
    static String gymName = "MM Gym";

    GymMember(int id, String name, String plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public void display() {
        System.out.println("\n----- Member Details -----");
        System.out.println("Gym Name : " + gymName);
        System.out.println("Member ID : " + id);
        System.out.println("Member Name : " + name);
        System.out.println("Membership Plan : " + plan);
    }

    public void display(String trainer) {
        System.out.println("\n----- Member Details -----");
        System.out.println("Gym Name : " + gymName);
        System.out.println("Member ID : " + id);
        System.out.println("Member Name : " + name);
        System.out.println("Membership Plan : " + plan);
        System.out.println("Trainer : " + trainer);
    }
}

public class java3 {
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
        
        GymMember m1 = new GymMember(id, name, plan);
        
        m1.display();
        m1.display(trainer);
        
        sc.close();
    }
}