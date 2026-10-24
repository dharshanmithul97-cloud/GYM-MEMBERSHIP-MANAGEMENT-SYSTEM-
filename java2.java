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
        System.out.println("Gym Name : " + gymName);
        System.out.println("Member ID : " + id);
        System.out.println("Member Name : " + name);
        System.out.println("Membership Plan : " + plan);
        System.out.println();
    }

    public void display(String trainer) {
        System.out.println("Gym Name : " + gymName);
        System.out.println("Member ID : " + id);
        System.out.println("Member Name : " + name);
        System.out.println("Membership Plan : " + plan);
        System.out.println("Trainer : " + trainer);
        System.out.println();
    }
}

public class java2 {
    public static void main(String[] args) {
        GymMember m1 = new GymMember(101, "Midhul", "Gold");
        GymMember m2 = new GymMember(102, "Rahul", "Silver");

        m1.display();
        m2.display("John");
    }
}