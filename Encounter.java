import java.util.Scanner;

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

        System.out.println("Arrr! Ye find yerself at the legendary Library of Genesis, \n" +
                "a digital treasure trove, hidden deep within the vast digital ocean.");
        Main.wait(5);
        System.out.println("Standin' at the entrance, a salty dog named Keshav ambles over, boastin' a friendly grin. \n" +
                "He introduces himself as the guardian of this trove and extends a digital textbook to ye.");
        Main.wait(5);
        libraryResponse();
    }
    public static void libraryResponse(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Be ye claimin' this tome, matey?(y/n)");
        String response = scan.next();
        switch(response){
            case "y":
                System.out.println("With the enthusiasm of a scallywag findin' buried treasure, ye snatch the book. \n" +
                        "Ye tucka it away for future plunder, knowin' full well it'll be dispatched to one of yer shipmates. \n" +
                        "With booty in hand, ye press on with yer grand adventure.");
                Main.wait(5);
                storm();
                break;
            case "n":
                System.out.println("With a polite but firm refusal, ye steer clear of the offer, \n" +
                        "continuin' yer escapade, a hearty 'no thanks' ringin' from yer lips.");
                Main.wait(5);
                storm();
                break;
            default:
                System.out.println("Arrr! Ye seem to be confusin' yer compass. \n" +
                        "Try inputtin' 'y' if ye be takin' the treasure or 'n' if ye be passin' it up, matey. \n" +
                        "No other route be navigatin' this choice.");
                libraryResponse();
        }

    }

    public static void storm(){
        System.out.println("Storm");

    }

}
