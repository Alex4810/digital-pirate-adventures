import java.util.Scanner;
public class Ship {
    public static Scanner scan = new Scanner(System.in);

    public int score = 0;

    public static void attack1() {
        //DDOS Broadside
    }
    public static void attack2(){
        //Malware Swivel Gun
    }
    public static void attack3(){
        //VPN Maneuver
    }

    public static void turn(){
        System.out.println("The privateer be relentless in its pursuit, but we'll not surrender without a fight, me hearties!\n" +
                "What be yer orders this turn? (1/2/3)\n");

        System.out.println("1. Ready the DDOS broadside, matey! We'll unleash a digital tempest to overwhelm the privateer's systems!");
        System.out.println("2. Aim the malware swivel gun at the privateer, firin' a logic bomb to disrupt their systems and sow chaos!");
        System.out.println("Execute evasive VPN maneuvers, attemptin' to dodge their attacks and keep our ship safe!");

        String input = scan.next();

        switch(input)   {
            default:
                System.out.println("Yarrr! Ye be needin' to make a choice, me heartie! Input 1, 2, or 3 to evade the enemy privateer. \n" +
                        "Any other course be takin' us straight into the digital doldrums!\n");
                turn();
                break;
            case "1":
                attack1();
                break;
            case "2":
                attack2();
                break;
            case "3":
                attack3();
                break;


        }
    }

}
