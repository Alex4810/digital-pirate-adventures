import java.sql.Time;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        intro();
        playerResponse();
        System.out.println("test");

    }
    public static void intro()
    {
        System.out.println("Ahoy there fellow digital pirate! " +
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
        switch(response)
        {
            case "y":
                System.out.println("Aye, ye be ready for adventure!");
                wait(1);
                break;
            case "n":
                System.out.println("Ah, a landlubber, are ye? Farewell for now!");
                System.exit(0);
                break;
            default:
                System.out.println("Arr, I didn't quite catch that. Try 'y' for yes or 'n' for no, matey!");
                playerResponse();
        }
    }
    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }




}
