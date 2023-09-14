import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
        intro();
        introPlayerResponse();
        System.out.println("test");
        clearScreen();
        Encounter.email();
        askNext(1);


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
    public static void introPlayerResponse()
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
                introPlayerResponse();

        }
    }
    public static void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }

    public static void askNext(int encounter)
    {
        Scanner scan = new Scanner(System.in);
        switch(encounter)
        {
            case 1:
                System.out.println("Would ye like to go to the library or move on?");
                String ans = scan.next();
                switch (ans)
                {
                    case "1":
                        System.out.println("1");
                        break;
                    case "2":
                        System.out.println("2");
                        break;
                    default:
                        System.out.println("invalid input");
                        askNext(1);
                }
                break;
            case 2:
                System.out.println("encounter 2");
                break;
            case 3:
                System.out.println("encounter 3");
                break;
            case 4:
                System.out.println("encounter 4");
                break;
            case 5:
                System.out.println("encounter 5");
                break;
        }
    }







}
