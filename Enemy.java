import java.util.Random;
public class Enemy {
    public static Random random = new Random();

    public static int score = 0;
    public static int attack = 0;




    public static void attack1()    {
        //firewall broadside
        System.out.println("\"Their cannons be ablaze with fiery fury as they prepare to scorch the digital seas with a Firewall Broadside!\"");
        attack = 1;
    }
    public static void attack2()    {
        //ip tracker swivel gun
        System.out.println("The enemy takes aim and fires their IP Tracker Swivel Gun, the digital crosshairs locked on our ship like a vengeful kraken!");
        attack = 2;
    }
    public static void attack3()    {
        //data snare chainshot
        System.out.println("The enemy sets loose their Data Snare Chainshot, aiming to shred our sails and leave us driftin' in the digital abyss!");
        attack = 3;
    }

    public static void turn(){
        attack = 0;
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




