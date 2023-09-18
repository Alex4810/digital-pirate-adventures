import java.util.Random;
public class Enemy {
    public static Random random = new Random();

    public int score = 0;


    public static void turn()   {

    }

    public static void attack1()    {
        //firewall broadside
        System.out.println("firewall");

    }
    public static void attack2()    {

        //data snare chainshot
        System.out.println("data snare");

    }
    public static void attack3()    {
        //ip tracker swivel gun
        System.out.println("ip tracker");

    }

    public static void turn(){
        int roll = random.nextInt(3)+1;
        switch(roll)    {
            case 1:
                attack1();
                break;
            case 2:
                attack2();
                break;
            case 3:
                attack3();
                break;
        }

    }
}




