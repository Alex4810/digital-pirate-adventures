import java.util.Scanner;
public class Ship {
    public static Scanner scan = new Scanner(System.in);

    public static int health;
    public static int bandwidth;
    public static int speed;
    public static int dodge;
    public static int armor;
    public static int accuracy;
    public static int damage;



    public Ship(int health, int bandwidth, int speed, int dodge, int armor, int accuracy, int damage)
    {
        this.health = health;
        this.bandwidth = bandwidth;
        this.speed = speed;
        this.dodge = dodge;
        this.armor = armor;
        this.accuracy = accuracy;
        this.damage = damage;
    }

    public static int broadsideType;
    public static int swivelType;
    public static int crewType;
    public static int sailType;
    public static int riggingType;


    public void turn()
    {

    }

    public void customize()
    {

    }

    public static void setBroadside(int broadside)
    {
        System.out.println("Yer broadside cannons be yer main attack. What type of cannon be yer choice? (1/2/3)\n");
        System.out.println("1. DDOS Cannon - Devastatin' damage, but accuracy be lackin.\n" +
                "2. DNS Leak Launchers - Medium damage n' accuracy; a safe choice\n" +
                "3. Zero Day Exploit Guns - They be strikin' true with high accuracy, but lower damage.");
        String input = scan.nextLine();
        switch(input)
        {
            case "1":
                broadside = 1;
                System.out.println("I like the way ye think, matey. Our DDOS cannons will make quick work o' the enemy.");
                break;
            case "2":
                broadside = 2;
                System.out.println("Keepin' everything balanced, I see. The best o' both worlds.");
                break;
            case "3":
                broadside = 3;
                System.out.println("No room for surprises, eh? Sometimes reliability be a the best choice.");
                break;
            default:
                System.out.println("Arr, I didn't quite catch that, matey. Input (1/2/3/) to choose yer cannon type.");
                setBroadside(broadsideType);
        }
    }

    public static void setSwivel(int swivel)
    {
        System.out.println("Yer swivel guns be a choice secondary gun. Smaller, but more precise. What be yer choice o' swivel? (1/2/3)\n");
        System.out.println("1. Zip Bomb Swivels - Load yer swivel guns with zip bombs to confuse yer enemy and lower their accuracy./n" +
                            "2. IP-Trace Swivels - Load em' with shots that trace yer enemies' digital footprints, boostin' yer accuracy." +
                            "3. Logic Bomb Swivels - Throw yer caution to the sea, unleashing pure RNG chaos and causin' unpredictable damage with every shot!");
        String input = scan.nextLine();
        switch(input)
        {
            case "1":
                swivel = 1;
                System.out.println("Any enemy we be facin' will have a hard time hittin' us once they get a taste o' these guns!");
                break;
            case "2":
                swivel = 2;
                System.out.println("We'll maximize our ship's accuracy with these trusty guns!");
                break;
            case "3":
                swivel = 3;
                System.out.println("Hehehe. Leavin' it all to chance, I see. If it's chaos ye wanted, it's chaos ye got.");
                break;
            default:
                System.out.println("Arr, I didn't quite catch that, capt'n. Input (1/2/3) to choose yer swivel gun ammo.");
                setSwivel(swivelType);
        }
    }

    public static void setCrew(int crew)
    {
        System.out.println("Our ship be havin' room for extra crew abilities. What be yer choice for em', matey?");
    }







}
