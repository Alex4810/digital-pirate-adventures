import java.util.Scanner;


public class Main {
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {

        intro();
        introPlayerResponse();

    }
    public static void intro()
    {
        System.out.println("\nAhoy there fellow digital pirate! " +
                "\nWelcome aboard yer trust ship and prepare to sail the internet seas! " +
                "\nI be yer trusty virtual quartermaster. " +
                "\nReady to embark on this digital adventure? (y/n)");
    }

    public static void setNames()
    {
        System.out.println("Ahoy, matey! Before we set sail on this digital adventure, what be yer name?");
        Ship.playerName = scan.nextLine();
        System.out.println("And what shall we name this trusty vessel that'll carry us through the binary seas, eh?");
        Ship.shipName = scan.nextLine();
        System.out.println("Aye, no names be finer for sailin' the high binary seas!");
        System.out.println("Take " + Ship.shipName + " full ahead, Captain " + Ship.playerName +"!\n" +
                "Adventure awaits, and the digital waves be callin' our name!\n");
        wait(10);

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
    public static void introPlayerResponse()
    {
        Scanner scan = new Scanner(System.in);
        String response = scan.nextLine();
        switch (response) {
            case "y":
                System.out.println("Aye, ye be ready for adventure!\n");
                wait(3);
                setNames();
                wait(5);
                Encounter.email();
                break;

            case "n":
                System.out.println("Ah, a landlubber, are ye? Farewell for now!");
                System.exit(0);

            default:
                System.out.println("Arr, I didn't quite catch that. Try 'y' for yes or 'n' for no, matey!");
                introPlayerResponse();

        }
    }
    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }









}
