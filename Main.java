import java.util.Random;
import java.util.Scanner;


public class Main {
    public static Ship player = new Ship(Ship.shipType.NONE, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);

        public static Enemy enemy = new Enemy();
        private static final Random roll = new Random();
        public static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {

            intro();
            introPlayerResponse();
            setUp();
            System.out.println(player.broadsideType);
            System.out.println(player.health);
            System.out.println(player.bandwidth);
            System.out.println(player.speed);
            System.out.println(player.dodge);
            System.out.println(player.armor);
            System.out.println(player.accuracy);
            System.out.println(player.damage);
            System.out.println(25 - (25 * player.armor));
            Fight.initiate(player, enemy);
            Encounter.email();
            Storm.intro();
            Storm.lightning(player);
            Storm.whirlwind(player);
            Storm.eruption(player);
            Storm.wave(player);
            Storm.end();
            Fight.intro();


            Encounter.pirateBayIntro();
            Encounter.pirateBay();

        }

        public static void intro() {
            System.out.println("\nAhoy there fellow digital pirate! " +
                    "\nWelcome aboard yer trust ship and preparey to sail the internet seas! " +
                    "\nI be yer trusty virtual quartermaster. " +
                    "\n\nReady to embark on this digital adventure? (y/n)");
        }

        public static void setUp() {
            System.out.println("Ahoy, matey! Before we set sail on this digital adventure, what be yer name?");
            askPlayerName();
            System.out.println("And what shall we name this trusty vessel that'll carry us through the binary seas, eh?");
            askShipName();
            System.out.println("Aye, no names be finer for sailin' the high binary seas!");
            askShipType();
            player.customize();
            System.out.println("Take " + Ship.shipName + " full ahead, Captain " + Ship.playerName + "!\n" +
                    "Adventure awaits, and the digital waves be callin' our name!\n");
            enterToContinue();
        }


        public static void askPlayerName() {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                System.out.println("Arr, it looks like you didn't input anything. What be yer name, matey?");
                askPlayerName();
            } else {
                Ship.playerName = input;
            }
        }

        public static void askShipName() {
            String input = scan.nextLine();
            if (input.isEmpty()) {
                System.out.println("Arr, it looks like you didn't input anything. What we be callin' yer ship, matey?");
            } else {
                Ship.shipName = input;
            }

        }

    public static void askShipType() {
        System.out.println("What type of ship be " + Ship.shipName + "? (1/2/3)");
        System.out.println("1. Sloop - fastest speed, lowest firepower \n" +
                "2. Frigate - balanced speed n' firepower \n" +
                "3. Galleon - superior firepower, slowest speed");
        String input = scan.nextLine();
        Ship.shipType type;
        switch (input) {
            case "1":
                type = Ship.shipType.SLOOP;
                break;
            case "2":
                type = Ship.shipType.FRIGATE;
                break;
            case "3":
                type = Ship.shipType.GALLEON;
                break;
            default:
                System.out.println("Arr, I didn't quite catch that. Input 1/2/3 for yer ship type!\n");
                askShipType();
                return;
        }
        player = new Ship(type, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false);
    }



    public static void wait(int secs) {
            int milis = secs * 1000;
            try {
                Thread.sleep(milis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        public static void introPlayerResponse() {
            Scanner scan = new Scanner(System.in);
            String response = scan.nextLine();
            switch (response) {
                case "y":
                    System.out.println("Aye, ye be ready for adventure!\n");


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

        public static void enterToContinue() {
            System.out.println("\n(Enter anything to continue)");
            scan.nextLine();
        }

        public static void healthCheck(Ship player) {
            if (player.health == 0) {
                System.out.println("\n\nYou are dead.\n\n*RE4 Leon death sound*");
                System.exit(0);

            }
        }

        public static int d20() {
            return roll.nextInt(20) + 1;
        }



}

