class Gym implements Runnable
{
    public void run()
    {
        String name = "mukesh";
        String status = "Activated ";

        System.out.println("--- Gym Membership ----");
        System.out.println("Member Name :" + name);
        System.out.println("Membership " + status);
    }
}

public class java82
{
    public static void main(String[] args)
    {
        
        System.out.println("Gym Memebership Management");
        Gym g1 = new Gym();
        Thread t1 = new Thread(g1);
        t1.start();
     }
}