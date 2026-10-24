class Gym extends Thread
{
    public void run()
    {
        String name = "mukesh";
        String status = "Activated ";

        System.out.println("---- Gym Membership ----");
        System.out.println("Member Name :" + name);
        System.out.println("Membership is " + status); 
    }
}

public class java81
{
    public static void main(String[] args)
    {
        System.out.println("Gym Memebership Management");  
        Gym g1 = new Gym();
        g1.start();
        
    }
}