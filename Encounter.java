import java.util.Scanner;
import java.util.Random;

public class Encounter {

    private static final Random roll = new Random();
    private static final Scanner scan = new Scanner(System.in);

    public static void email()//email
    {
        System.out.println("First, let's cast our eyes upon our electronic treasure chest and see if we've plundered any digital messages.");
        Main.wait(5);
        System.out.println("Ahoy, it seems there be a fresh scroll in the inbox!");
        Main.wait(3);
        System.out.println("Enter yer secret passphrase to unfurl the message, matey:");
        String input = scan.next();
        Main.wait(1);
        System.out.println("[Hey what's up, the torrent file for that new game got released this morning." +
                "\nps if you get the chance could you send me the textbook for the class? ty.]");
        Main.wait(10);
        System.out.println("\nHmm, it be lookin' like we ought to make a course for The Pirate Bay." +
                "\nBut mayhaps we should pay a visit to the library if fortune smiles upon us.");
    }

    public static void library() {
        Main.clearScreen();
        System.out.println("Arrr! Ye find yerself at the legendary Library Genesis, \n" +
                "a digital treasure trove, hidden deep within the vast digital ocean.");
        Main.wait(10);
        System.out.println("Standin' at the entrance, a salty dog named Keshav ambles over, boastin' a friendly grin. \n" +
                "He introduces himself as the guardian of this trove and extends a digital textbook to ye.");
        Main.wait(10);
        libraryResponse();
    }
    public static void libraryResponse(){
        System.out.println("Be ye claimin' this tome, matey?(y/n)");
        String response = scan.next();
        switch(response){
            case "y":
                System.out.println("With the enthusiasm of a scallywag findin' buried treasure, ye snatch the book. \n" +
                        "Ye tuck it away for future plunder, knowin' full well it'll be dispatched to one of yer shipmates. \n" +
                        "With booty in hand, ye press on with yer grand adventure.");
                Main.wait(15);
                stormIntro();
                break;
            case "n":
                System.out.println("With a polite but firm refusal, ye steer clear of the offer, \n" +
                        "continuin' yer escapade, a hearty 'no thanks' ringin' from yer lips.");
                Main.wait(15);
                stormIntro();
                break;
            default:
                System.out.println("Arrr! Ye seem to be confusin' yer compass. \n" +
                        "Try inputtin' 'y' if ye be takin' the treasure or 'n' if ye be passin' it up, matey. \n" +
                        "No other route be navigatin' this choice.");
                libraryResponse();
        }

    }

    public static void stormIntro(){
        Main.clearScreen();
        Main.wait(2);
        System.out.println("Ye be sailin' onward, but a fearsome Bitstorm be upon us! \n" +
                "We'll need to muster all our courage and wit to navigate this tempest, \n" +
                "but I've no doubt we'll emerge triumphant on the other side, matey!\n");
        Main.wait(15);

        stormLightning();
    }

    public static void stormLightning(){
        System.out.println("The skies 'round ye turn as dark as a coder's soul. \n" +
                "A taste of metal fills yer mouth, and the scent o' ozone stings yer nose. \n" +
                "The ship's deck quivers as metal objects begin to vibrate.\n");

        Main.wait(10);
        System.out.println("A Data Surge Lightning Strike be on the horizon! What be yer course, captain? (1/2/3):");

        System.out.println("1. Ready the VPN defenses! We'll shield the ship and face this lightning head-on!\n" +
                           "2. Quick as a flash, execute a maneuver to dodge the strike and keep us safe.\n" +
                           "3. Brave the storm and sail straight, though it risks harm to our ship, we'll not be swayed!\n");

        String input = scan.next();
        switch (input)
        {
            case "1":
                stormRoll(1, 1);
                break;
            case "2":
                stormRoll(1,2);
                break;
            case "3":
                stormRoll(1,3);
                break;
            default:
                System.out.println("Ye hesitated too long, and the storm's fury be takin' its toll. \n" +
                        "Lightning strikes the ship, causin' damage! \n" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }
        stormWhirlwind();
    }
    public static void stormWhirlwind(){
        System.out.println("The lightning strike be but a memory, and they say lightning don't strike the same spot twice. \n" +
                "Ye be prayin' that be true as ye forge ahead into the heart of the Bitstorm. \n" +
                "All of a sudden, the winds be howlin', and a data debris whirlwind be upon us!\n");
        Main.wait(10);
                System.out.println("What be our course, captain? (1/2/3)");

        System.out.println("1. Ready the swivel gun! We'll give that whirlwind a taste o' digital lead to clear our path.\n" +
                           "2. Steady as she goes, we'll navigate with caution through the whirlwind, takin' it slow but riskin' delays.\n" +
                           "3. Put our brains to work and analyze the data patterns within the whirlwind for a potential shortcut.\n");

        String input = scan.next();
        switch (input)
        {
            case "1":
                stormRoll(2, 1);
                break;
            case "2":
                stormRoll(2,2);
                break;
            case "3":
                stormRoll(2,3);
                break;
            default:
                System.out.println("Yer moment o' hesitation be costly, matey! \n" +
                        "The whirlwind's fury damages the ship! \n" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }
        stormEruption();
    }
    public static void stormEruption(){
        System.out.println("With the whirlwind dissipated, a sense o' relief washes over ye, but ye know rest be not yet within reach! \n" +
                "From the depths of Davey Jones' locker, a deep rumbling sound echoes—a firewall eruption be upon us!\n");
        Main.wait(10);

        System.out.println("What be yer orders, captain? (1/2/3))");

        System.out.println("1. Search the digital depths for a weakness or a temporary opening in the firewall to pass through.\n" +
                "2. Ready the DDOS cannon, matey! We'll blast through that firewall and carve a path for our ship.\n" +
                "3. Exercise patience, me heartie! Wait for the firewall to dissipate naturally, savin' our resources but takin' the risk of delay.\n");

        String input = scan.next();
        switch (input)
        {
            case "1":
                stormRoll(3, 1);
                break;
            case "2":
                stormRoll(3,2);
                break;
            case "3":
                stormRoll(3,3);
                break;
            default:
                System.out.println("Ye waited too long, and the firewall's grip be upon us! \n" +
                        "Our ship's stalled and wasted its precious bandwidth!" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }
        stormWave();
    }
    public static void stormWave(){
        System.out.println("With the firewall behind us, it seems we be approachin' the end of the storm. \n" +
                "But rest be not yet ours, for lo and behold, a grey beard approaches! \n");
        Main.wait(10);

        System.out.println("'Tis a data packet wave, me heartie! What be yer orders, captain? (1/2/3)");

        System.out.println("1. Ready the encryption measures!! We'll raise a protective shield against the oncomin' packet wave.");
        System.out.println("2. Steer the ship with skill and precision! We'll ride the wave to gain a temporary speed boost!");
        System.out.println("3. Slacken the sails and weather the wave with caution, riskin' little but sacrificin' some speed.\n");

        String input = scan.next();
        switch (input)
        {
            case "1":
                stormRoll(4, 1);
                break;
            case "2":
                stormRoll(4,2);
                break;
            case "3":
                stormRoll(4,3);
                break;
            default:
                System.out.println("Ye hesitated, and the wave struck the ship! \n" +
                        "Brace yerself, me heartie—the storm be nearin' its end, but we've suffered some packet loss along the way!" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }
        stormEnd();


    }


    public static void stormEnd()   {
        System.out.println("With the Bitstorm behind us, we set our course forward, onward to new digital horizons! \n" +
                "The high binary seas await, and there be adventures yet to come, me heartie!\n");
        Main.wait(10);
    }

    public static void stormRoll(int type, int input){
        switch(type)    {
            case 1:
                int storm1 = roll.nextInt(3)+1;
                if(input == storm1)  {
                    System.out.println("Alas! The lightning strikes true, and we've taken damage, \n" +
                            "but our spirit be unbreakable! We press on, aye!\n");
                }
                else
                {
                    System.out.println("Our defenses held strong, and the lightning be naught but a spark! \n " +
                            "Onward we sail, unharmed and undeterred!\n");
                }
                break;
            case 2:
                int storm2 = roll.nextInt(3)+1;
                if(input == storm2)  {
                    System.out.println("The data debris be strikin' the ship, causin' damage! \n" +
                            "But we'll not let it break our spirit, and we press on with the wind in our sails!\n");
                }
                else
                {
                    System.out.println("We've maneuvered skillfully, avoidin' the whirlwind's wrath, and our journey continues, unscathed!\n");
                }
                break;
            case 3:
                int storm3 = roll.nextInt(3)+1;
                if(input == storm3) {
                    System.out.println("By Neptune's beard! The firewall's holdin' firm, and we must try again later. \n" +
                            "Our ship stalls, burnin' precious bandwidth!\n");
                }
                else    {
                    System.out.println("Aye, the ship slipped through unscathed, and we sail onward!\n");
                }
                break;
            case 4:
                int storm4 = roll.nextInt(3)+1;
                if(input == storm4)  {
                    System.out.println("The wave's wrath be upon us, and we've suffered packet loss! But our resolve be unshaken, and we sail on!\n");
                }
                else {
                    System.out.println("Luck be smilin' upon us! We've nimbly avoided the wave, and our voyage continues with nary a packet lost!\n");
                }
                break;
        }
    }

    public static void privateerIntro()
    {
        Main.clearScreen();
        System.out.println("With the Bitstorm finally behind us, the air clears, and we find ourselves bathed in the calm after the digital tempest. \n" +
                "The ship sails steadily as we breathe a sigh of relief, believin' the worst to be behind us. \n" +
                "Little did we know, me hearties, that the high binary seas still held a twist of fate in store.\n");

        Main.wait(15);

        System.out.println("As we basked in a false sense of security, a shadow slowly grew on the digital horizon—a looming menace, darker than the blackest night. \n" +
                "'Twas an enemy privateer, sailin' the same binary seas as us! \n" +
                "The air crackles with tension as the privateer's vessel draws near, unfurlin' its ominous flag. \n" +
                "We've found ourselves in a showdown on the digital waves, and the stakes be higher than ever! Stand ready, me hearties, for the clash of digital swords and bytes draws nigh!");
    }

    public static void privateerFight()
    {
        Enemy privateer = new Enemy();
        Ship pirate = new Ship();



    }
    public static void scoreCheck(){

    }


}
