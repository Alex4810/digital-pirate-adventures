import java.util.Scanner;
import java.lang.Math;

public class Encounter {
    public static void email()//email
    {
        Scanner scan = new Scanner(System.in);
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
        System.out.println("Arrr! Ye find yerself at the legendary Library of Genesis, \n" +
                "a digital treasure trove, hidden deep within the vast digital ocean.");
        Main.wait(10);
        System.out.println("Standin' at the entrance, a salty dog named Keshav ambles over, boastin' a friendly grin. \n" +
                "He introduces himself as the guardian of this trove and extends a digital textbook to ye.");
        Main.wait(10);
        libraryResponse();
    }
    public static void libraryResponse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Be ye claimin' this tome, matey?(y/n)");
        String response = scan.next();
        switch(response){
            case "y":
                System.out.println("With the enthusiasm of a scallywag findin' buried treasure, ye snatch the book. \n" +
                        "Ye tuck it away for future plunder, knowin' full well it'll be dispatched to one of yer shipmates. \n" +
                        "With booty in hand, ye press on with yer grand adventure.");
                Main.wait(5);
                stormIntro();
                break;
            case "n":
                System.out.println("With a polite but firm refusal, ye steer clear of the offer, \n" +
                        "continuin' yer escapade, a hearty 'no thanks' ringin' from yer lips.");
                Main.wait(5);
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
                "but I've no doubt we'll emerge triumphant on the other side, matey!");

        stormLightning();
        stormWhirlwind();
        stormEruption();
        stormWave();
        stormCurrent();
    }

    public static void stormLightning(){
        Scanner scan = new Scanner(System.in);
        System.out.println("The skies 'round ye turn as dark as a coder's soul. \n" +
                "A taste of metal fills yer mouth, and the scent o' ozone stings yer nose. \n" +
                "The ship's deck quivers as metal objects begin to vibrate.");
        System.out.println("A Data Surge Lightning Strike be on the horizon! What be yer course, captain? (1/2/3):");
        System.out.println("1. Ready the VPN defenses! We'll shield the ship and face this lightning head-on!\n" +
                "2. Quick as a flash, execute a maneuver to dodge the strike and keep us safe.\n" +
                "3. Brave the storm and sail straight, though it risks harm to our ship, we'll not be swayed!");
        String input = scan.next();

    }
    public static void stormWhirlwind(){
    }
    public static void stormEruption(){

    }
    public static void stormWave(){

    }
    public static void stormCurrent(){

    }


}
