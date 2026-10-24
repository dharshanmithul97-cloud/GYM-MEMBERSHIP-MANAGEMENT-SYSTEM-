class GymMembership {

    int availableSlots = 2;

    synchronized void joinGym(String name, int slots) {

        System.out.println(name + " wants to join for " + slots + " slot(s).");

        while (availableSlots < slots) {

            System.out.println(name + " is waiting for available slots...");

            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        availableSlots -= slots;

        System.out.println(name + " joined the gym for " + slots + " slot(s).");
        System.out.println("Available Slots: " + availableSlots);
    }

    synchronized void cancelMembership(String name, int slots) {

        availableSlots += slots;

        System.out.println(name + " cancelled " + slots + " membership slot(s).");
        System.out.println("Available Slots: " + availableSlots);

        notify();
    }
}


class MembershipThread extends Thread {

    GymMembership gym;
    String name;
    int slots;

    MembershipThread(GymMembership gym, String name, int slots) {

        this.gym = gym;
        this.name = name;
        this.slots = slots;
    }

    public void run() {

        gym.joinGym(name, slots);
    }
}


class CancelMembershipThread extends Thread {

    GymMembership gym;
    String name;
    int slots;

    CancelMembershipThread(GymMembership gym, String name, int slots) {

        this.gym = gym;
        this.name = name;
        this.slots = slots;
    }

    public void run() {

        gym.cancelMembership(name, slots);
    }
}


public class java9{

    public static void main(String[] args) {

        GymMembership gym = new GymMembership();

        MembershipThread t1 =
            new MembershipThread(gym, "Member 1", 2);

        MembershipThread t2 =
            new MembershipThread(gym, "Member 2", 1);

        CancelMembershipThread t3 =
            new CancelMembershipThread(gym, "Member 1", 1);

        t1.start();
        t2.start();
        t3.start();
    }
}