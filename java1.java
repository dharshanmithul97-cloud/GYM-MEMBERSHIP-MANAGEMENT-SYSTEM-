class GymMember {
    int id;
    String name;
    String plan;

    GymMember(int id, String name, String plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;

        System.out.println("----- Member Details -----");
        System.out.println("Member ID : " + id);
        System.out.println("Member Name : " + name);
        System.out.println("Membership Plan : " + plan);
        System.out.println();
    }
}

public class java1 {
    public static void main(String[] args) {
        GymMember m1 = new GymMember(101, "Midhul", "Gold");
        GymMember m2 = new GymMember(102, "Rahul", "Silver");
        GymMember m3 = new GymMember(103, "Arun", "Platinum");
    }
}