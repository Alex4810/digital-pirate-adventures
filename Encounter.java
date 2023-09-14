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
        System.out.println("[Hey what's up just letting you know that there's some new stuff on pirate bay." +
                "\nIt's pretty cool. you should check it out." +
                "\nps if you get the chance could you send me the textbook for the class? ty.]");
        Main.wait(10);
        System.out.println("\nHmm, it be lookin' like we ought to make a course for Pirate Bay." +
                "\nBut mayhaps we should pay a visit to the library if fortune smiles upon us.");
    }
}
