import java.util.Scanner;
public class Player {
    public static int initiative;
    public static String playerName;
    public static String shipName;
    public static Scanner scan = new Scanner(System.in);
    public static int attack = 0;
    public static int health = 10;



    public static void attack1() {
        System.out.println("The DDOS Broadside cannons bellow to life as we be ready to unleash a storm of digital mayhem!\n");

        attack = 1;
        //DDOS Broadside
    }
    public static void attack2(){
        System.out.println("With a flick of the switch, our ship be vanishing into the digital shadows, hidden from prying eyes!\n");

        attack = 2;
        //VPN Maneuver
    }
    public static void attack3(){
        System.out.println("The Malware Swivel Gun be primed, poised to fire a logic bomb that'll set their systems a'rumblin'!\n");

        attack = 3;
        //Malware Swivel Gun - logic bomb
    }

    public static void turn()
    {
        attack = 0;
        Main.clearScreen();
        System.out.println("\nThe privateer be relentless in its pursuit, but we'll not surrender without a fight!\n");

        System.out.println("What be yer orders this turn? (1/2/3)");

        System.out.println("1. Ready the DDOS broadside! We'll unleash a digital tempest to overwhelm the privateer's systems!");
        System.out.println("2. Execute evasive VPN maneuvers, attemptin' to dodge their attacks and keep our ship safe!");
        System.out.println("3. Aim the malware swivel gun at the privateer, firin' a logic bomb to disrupt their systems and sow chaos!");

        String input = scan.nextLine();

        switch(input)   {

            case "1":
                attack1();
                break;
            case "2":
                attack2();
                break;
            case "3":
                attack3();
                break;
            default:
                System.out.println("Yarrr! Ye be needin' to make a choice, me heartie! Input 1, 2, or 3 to evade the enemy privateer. \n" +
                        "Any other course be takin' us straight into the digital doldrums!\n");
                turn();
                break;
        }



    }
//    The privateer be relentless in its pursuit, but we'll not surrender without a fight, me hearties!
//    What be yer orders this turn? (1/2/3)
//    Ready the DDOS broadside, matey! We'll unleash a digital tempest to overwhelm the privateer's systems.
//    Execute evasive VPN maneuvers, attemptin' to dodge their attacks and keep our ship safe.
//    Aim the malware swivel gun at the privateer, firin' a logic bomb to disrupt their systems and sow chaos.
//
   // invalid -  Yarrr! Ye be needin' to make a choice, me heartie! Input 1, 2, or 3 to evade the enemy privateer. Any other course be takin' us straight into the digital doldrums

}
