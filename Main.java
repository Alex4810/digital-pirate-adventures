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
                System.out.println("1. Go to the Library (1)\n" +
                        "2. Sail straight to The Pirate Bay (2)");
                String ans = scan.next();
                switch (ans)
                {
                    case "1":
                        System.out.println("\"Aye, matey! To the Library of Genesis we shall sail first! \n" +
                                "Knowledge be our treasure today!\"\n");
                        wait(5);
                        Encounter.library();
                        break;
                    case "2":
                        System.out.println("\"Arrr, hoist the anchor! \n" +
                                "We'll be setting a course straight for The Pirate Bay, adventure awaits!\"\n");
                        wait(5);
                        Encounter.storm();
                        break;
                    default:
                        System.out.println("Yarrr! Ye didn't quite get the hang of it. \n" +
                                "Try inputting '1' to visit the Library or '2' to head to The Pirate Bay.\n");
                        wait(5);
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
