import java.util.Random;
import java.util.Scanner;


public class Main {
        private static final Random roll = new Random();
        public static final Scanner scan = new Scanner(System.in);

        public static void main(String[] args) {

            Enemy enemy = new Enemy();

            intro();
            introPlayerResponse();

            Ship player = askShipType();
            player.customize();
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
            System.out.println("Ahoy there fellow digital pirate!\n"
                    +"Welcome aboard yer trust ship and prepare to sail the internet seas!\n"
                    +"I be yer trusty virtual quartermaster.\n"
                    +"Ready to embark on this digital adventure? (y/n)");
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

        public static Ship askShipType()
        {
            System.out.println("What be the type o' yer ship, matey? (1/2/3)\n"
                              +"1. Sloop - fastest speed, lowest firepower\n"
                              +"2. Frigate - balanced speed n' firepower\n"
                              +"3. Galleon - superior firepower, slowest speed");
            String input = scan.nextLine();
            switch(input)
            {
                case "1":
                    return new Sloop(200, 100, 10, 7, 0.1, 0, 0.75);
                case "2":
                    return new Frigate(350,250,7,3,0.20,3,100);
                case "3":
                    return new Galleon(500,200,4,1,0.30,6,1.25);
                default:
                    System.out.println("Arr, I didn't quite catch that. Input 1/2/3, to choose yer ship type, matey.");
                    return askShipType();
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
        public static void wait(int secs) {
            int milis = secs * 1000;
            try {
                Thread.sleep(milis);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }



}

