import java.util.Random;

public class Baby implements Runnable
{
    private int time;
    private String name;

    public Baby(String name)
    {
        this.name = name;
        Random randomGenerator = new Random();

        this.time = randomGenerator.nextInt(5000);

    }
    public void run()
    {

        try
        {
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");

            Thread.sleep(time);
            System.out.println("My name is "+ name + " and I'm awake, feed me!!!");
        }
        catch(InterruptedException e)
        {
            //System.out.println("An error has been encountered, something went wrong");
            e.printStackTrace();
        }

    }
}
