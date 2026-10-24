class GymMembership {
    private int availableMemberships = 10;
    private double gymBalance = 5000;

    private final Object membershipLock = new Object();
    private final Object paymentLock = new Object();

    public void registerMember(String name, int memberships, double fee) {

        synchronized (membershipLock) {
            synchronized (paymentLock) {

                System.out.println(name + " is registering for gym membership.");

                if (availableMemberships >= memberships && fee > 0) {
                    availableMemberships -= memberships;
                    gymBalance += fee;

                    System.out.println("Membership registered successfully!");
                    System.out.println("Member Name: " + name);
                    System.out.println("Memberships Booked: " + memberships);
                    System.out.println("Membership Fee: Rs." + fee);
                } else {
                    System.out.println("Registration failed for " + name);
                    System.out.println("Insufficient memberships or invalid fee.");
                }

                System.out.println();
            }
        }
    }

    public void displayDetails() {
        synchronized (membershipLock) {
            synchronized (paymentLock) {
                System.out.println("----- Gym Management Details -----");
                System.out.println("Available Memberships: " + availableMemberships);
                System.out.println("Total Gym Balance: Rs." + gymBalance);
            }
        }
    }
}

class GymRegistrationThread extends Thread {
    private GymMembership gym;
    private String memberName;
    private int memberships;
    private double fee;

    public GymRegistrationThread(GymMembership gym, String memberName,
                                 int memberships, double fee) {
        this.gym = gym;
        this.memberName = memberName;
        this.memberships = memberships;
        this.fee = fee;
    }

    public void run() {
        gym.registerMember(memberName, memberships, fee);
    }
}

public class java10{
    public static void main(String[] args) {

        GymMembership gym = new GymMembership();

        GymRegistrationThread t1 =
                new GymRegistrationThread(gym, "Arun", 1, 1000);

        GymRegistrationThread t2 =
                new GymRegistrationThread(gym, "Kumar", 2, 2000);

        GymRegistrationThread t3 =
                new GymRegistrationThread(gym, "Rahul", 1, 1500);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread execution interrupted.");
            return;
        }

        gym.displayDetails();
    }
}