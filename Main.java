import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        intro();
        playerResponse();
        System.out.println("test");
        clearScreen();
        encounter1();

    }
    public static void intro()
    {
        System.out.println("\nAhoy there fellow digital pirate! " +
                "\nWelcome aboard the \"Crimson Kraken,\" a legendary ship sailin' the internet seas. " +
                "\nI be yer trusty virtual quartermaster. " +
                "\nReady to embark on this digital adventure? (y/n)");
    }
    public static void wait(int secs)
    {
        int milis = secs*1000;
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public static void playerResponse()
    {
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        switch (response) {
            case "y":
                System.out.println("Aye, ye be ready for adventure!");
                wait(3);
                break;

            case "n":
                System.out.println("Ah, a landlubber, are ye? Farewell for now!");
                System.exit(0);

            default:
                System.out.println("Arr, I didn't quite catch that. Try 'y' for yes or 'n' for no, matey!");
                playerResponse();

        }
    }
    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }
    public static void encounter1()//email
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("First, let's cast our eyes upon our electronic treasure chest and see if we've plundered any digital messages.");
        wait(5);
        System.out.println("Ahoy, it seems there be a fresh scroll in the inbox!");
        wait(1);
        System.out.println("Enter yer secret passphrase to unfurl the message, matey:");
        String input = scan.next();
        wait(1);
        System.out.println("[Hey what's up just letting you know that there's some new stuff on pirate bay." +
                "\nIt's pretty cool. you should check it out." +
                "\nps if you get the chance could you stop by the library for me? ty.]");
        wait(10);
        System.out.println("\nHmm, it be lookin' like we ought to make a course for Pirate Bay." +
                "\nBut mayhaps we should pay a visit to the library if fortune smiles upon us.");
    }
    public static void encounter2()
    {
        System.out.println("placeholder text 2");
    }
    public static void encounter3()
    {
        System.out.println("placeholder text 3");
    }
    public static void encounter4()
    {
        System.out.println("placeholder text 4");
    }
    public static void encounter5()
    {
        System.out.println("placeholder text 5");
    }





}
