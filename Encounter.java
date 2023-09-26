import java.util.Scanner;
import java.util.Random;

public class Encounter {

    private static final Random roll = new Random();
    private static final Scanner scan = new Scanner(System.in);
    public static boolean textbook = false;
    public static boolean library = false;

    public static void email()//email
    {
        Main.clearScreen();
        System.out.println("First, let's cast our eyes upon our electronic treasure chest and see if we've plundered any digital messages.");
        System.out.println("\nAhoy, it seems there be a fresh scroll in the inbox!");
        System.out.println("\nEnter yer secret passphrase to unfurl the message, matey:");
        scan.nextLine();
        System.out.println("[Hey what's up, the torrent file for that new game just got released this morning." +
                "\nps if you get the chance could you send me the textbook for the class? ty.]");

        System.out.println("\nHmm, it be lookin' like we ought to make a course for The Pirate Bay." +
                "\nBut mayhaps we should pay a visit to the library if fortune smiles upon us.\n");
        libOrSea();
    }
    public static void libOrSea()
    {
        System.out.println("1. Go to the Library (1)\n" +
                "2. Sail straight to The Pirate Bay (2)");
        String ans = scan.nextLine();
        switch (ans)
        {
            case "1":
                library = true;
                System.out.println("\nAye, matey! To the Library Genesis we shall sail first! \n" +
                        "Knowledge be our treasure today!\n");
                Main.enterToContinue();
                library();
                break;
            case "2":
                library = false;
                System.out.println("There be no time to waste! Arrr, hoist the anchor! \n" +
                        "We'll be setting a course straight for The Pirate Bay, adventure awaits!\n");
                Main.enterToContinue();
                Encounter.stormIntro();
                break;
            default:
                System.out.println("Yarrr! Ye didn't quite get the hang of it. \n" +
                        "Try inputting '1' to visit the Library or '2' to head to The Pirate Bay.\n");
                libOrSea();
        }

    }

    public static void library() {
        Main.clearScreen();
        System.out.println("Arrr! Ye find yerself at the legendary Library Genesis, \n" +
                "a digital treasure trove, hidden deep within the vast digital ocean.");
        System.out.println("\nStandin' at the entrance, a salty dog named Keshav ambles over, boastin' a friendly grin. \n" +
                "He introduces himself as the guardian of this trove and extends a digital textbook to ye.");
        libraryResponse();
    }
    public static void libraryResponse(){
        System.out.println("\nBe ye claimin' this tome, matey?(y/n)");
        String response = scan.nextLine();
        switch(response){
            case "y":
                textbook = true;
                System.out.println("\nWith the enthusiasm of a scallywag findin' buried treasure, ye snatch the book. \n" +
                        "Ye tuck it away for future plunder, knowin' full well it'll be dispatched to one of yer shipmates. \n" +
                        "With booty in hand, ye press on with yer grand adventure.");
                Main.enterToContinue();
                stormIntro();
                break;
            case "n":
                textbook = false;
                System.out.println("\nWith a polite but firm refusal, ye steer clear of the offer, \n" +
                        "continuin' yer escapade, a hearty 'no thanks' ringin' from yer lips.");
                Main.enterToContinue();
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
        System.out.println("Ye be sailin' onward, but a fearsome Bitstorm be upon us! \n\n" +
                "We'll need to muster all our courage and wit to navigate this tempest, \n\n" +
                "but I've no doubt we'll emerge triumphant on the other side, matey!\n");
        Main.enterToContinue();
        stormLightning();
    }

    public static void stormLightning(){
        System.out.println("The skies 'round ye turn as dark as a coder's soul. \n\n" +
                "A taste of metal fills yer mouth, and the scent o' ozone stings yer nose. \n\n" +
                "The ship's deck quivers as metal objects begin to vibrate.\n");
        Main.enterToContinue();
        System.out.println("\nA Data Surge Lightning Strike be on the horizon! What be yer course, captain? (1/2/3):\n");

        System.out.println("1. Ready the VPN defenses! We'll shield the ship and face this lightning head-on!\n" +
                           "2. Quick as a flash, execute a maneuver to dodge the strike and keep us safe.\n" +
                           "3. Brave the storm and sail straight, though it risks harm to our ship, we'll not be swayed!\n");

        String input = scan.nextLine();
        switch (input)
        {
            case "1":
                stormRoll(1, 1);
                break;
            case "2":
                stormRoll(1,2);
                break;
            case "3":
                stormRoll(1,3);
                break;
            default:
                System.out.println("Ye hesitated too long, and the storm's fury be takin' its toll. \n" +
                        "Lightning strikes the ship, causin' damage! \n" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }
        Main.enterToContinue();
        stormWhirlwind();
    }
    public static void stormWhirlwind(){
        Main.clearScreen();
        System.out.println("The lightning strike be but a memory, and they say lightning don't strike the same spot twice. \n" +
                "Ye be prayin' that be true as ye forge ahead into the heart of the Bitstorm.\n");
        Main.enterToContinue();
        System.out.println("All of a sudden, the winds be howlin', and a data debris whirlwind be upon us! What be our course, captain? (1/2/3)\n");

        System.out.println("1. Ready the swivel gun! We'll give that whirlwind a taste o' digital lead to clear our path.\n" +
                           "2. Steady as she goes, we'll navigate with caution through the whirlwind, takin' it slow but riskin' delays.\n" +
                           "3. Put our brains to work and analyze the data patterns within the whirlwind for a potential shortcut.\n");

        String input = scan.nextLine();
        switch (input)
        {
            case "1":
                stormRoll(2, 1);
                break;
            case "2":
                stormRoll(2,2);
                break;
            case "3":
                stormRoll(2,3);
                break;
            default:
                System.out.println("Yer moment o' hesitation be costly, matey! \n" +
                        "The whirlwind's fury damages the ship! \n" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }
        Main.enterToContinue();
        stormEruption();
    }
    public static void stormEruption(){
        Main.clearScreen();
        System.out.println("With the whirlwind dissipated, a sense o' relief washes over ye, but ye know rest be not yet within reach! \n");
        Main.enterToContinue();
        System.out.println("From the depths of Davey Jones' locker, a deep rumbling sound echoes — a firewall eruption be upon us! What be yer orders, captain? (1/2/3)\n");


        System.out.println("1. Search the digital depths for a weakness or a temporary opening in the firewall to pass through.\n" +
                "2. Ready the DDOS cannon, matey! We'll blast through that firewall and carve a path for our ship.\n" +
                "3. Exercise patience, me heartie! Wait for the firewall to dissipate naturally, savin' our resources but takin' the risk of delay.\n");

        String input = scan.nextLine();
        switch (input)
        {
            case "1":
                stormRoll(3, 1);
                break;
            case "2":
                stormRoll(3,2);
                break;
            case "3":
                stormRoll(3,3);
                break;
            default:
                System.out.println("Ye waited too long, and the firewall's grip be upon us! \n" +
                        "Our ship's stalled and wasted its precious bandwidth!" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }
        Main.enterToContinue();
        stormWave();
    }
    public static void stormWave(){
        Main.clearScreen();
        System.out.println("With the firewall behind us, it seems we be approachin' the end of the storm. \n" +
                "But rest be not yet ours, for lo and behold, a monster swell be approachin'! \n");
        Main.enterToContinue();

        System.out.println("'Tis a data packet wave, me heartie! What be yer orders, captain? (1/2/3)\n");

        System.out.println("1. Ready the encryption measures!! We'll raise a protective shield against the oncomin' packet wave.");
        System.out.println("2. Steer the ship with skill and precision! We'll ride the wave to gain a temporary speed boost!");
        System.out.println("3. Slacken the sails and weather the wave with caution, riskin' little but sacrificin' some speed.\n");

        String input = scan.nextLine();
        switch (input)
        {
            case "1":
                stormRoll(4, 1);
                break;
            case "2":
                stormRoll(4,2);
                break;
            case "3":
                stormRoll(4,3);
                break;
            default:
                System.out.println("Ye hesitated, and the wave struck the ship! \n" +
                        "Brace yerself, me heartie—the storm be nearin' its end, but we've suffered some packet loss along the way!" +
                        "Act swiftly, lest the tempest consumes us!\n");
                break;
        }

        stormEnd();
        Fight.intro();


    }


    public static void stormEnd()   {
        System.out.println("\n\nThe Bitstorm be behind us, me hearties! We set our course forward, onward to new digital horizons! \n" +
                "\nThe high binary seas await, and there be adventures yet to come, me heartie!\n");
        Main.enterToContinue();
    }

    public static void stormRoll(int type, int input){
        switch(type)    {
            case 1:
                int storm1 = roll.nextInt(3)+1;
                if(input == storm1)  {
                    System.out.println("Alas! The lightning strikes true, and we've taken damage, but our spirit be unbreakable! We press on, aye!\n");
                    Player.health --;
                    healthCheck();
                }
                else
                {
                    System.out.println("Our defenses held strong, and the lightning be naught but a spark! \n" +
                            "Onward we sail, unharmed and undeterred!\n");
                }
                break;
            case 2:
                int storm2 = roll.nextInt(3)+1;
                if(input == storm2)  {
                    System.out.println("The data debris be strikin' the ship, causin' damage! \n" +
                            "But we'll not let it break our spirit, and we press on with the wind in our sails!\n");
                    Player.health --;
                    healthCheck();
                }
                else
                {
                    System.out.println("We've maneuvered skillfully, avoidin' the whirlwind's wrath, and our journey continues, unscathed!\n");
                }
                break;
            case 3:
                int storm3 = roll.nextInt(3)+1;
                if(input == storm3) {
                    System.out.println("By Neptune's beard! The firewall's holdin' firm, and we must try again later. \n" +
                            "Our ship stalls, burnin' precious bandwidth!\n");
                    Player.health --;
                    healthCheck();
                }
                else    {
                    System.out.println("Aye, the ship slipped through unscathed, and we sail onward!\n");
                }
                break;
            case 4:
                int storm4 = roll.nextInt(3)+1;
                if(input == storm4)  {
                    System.out.println("The wave's wrath be upon us, and we've suffered packet loss! But our resolve be unshaken, and we sail on!\n");
                    Player.health --;
                    healthCheck();
                }
                else {
                    System.out.println("Luck be smilin' upon us! We've nimbly avoided the wave, and our voyage continues with nary a packet lost!\n");
                }
                break;
        }
    }





    public static void pirateBayIntro()
    {
        Main.enterToContinue();
        Main.clearScreen();
        System.out.println("Af'er a harrowing journey through the turbulent seas o' the digital realm, yer vessel finally drops anchor at The Pirate Bay. \n" +
                "This fabled sanctuary fer buccaneers, nestled deep within the binary tides, teems with activity.\n");

                System.out.println("\nAs ye make landfall, the sights an' sounds o' fellow pirates from all corners o' the digital world surround ye. \n" +
                "Flags adorned with the symbols o' diverse factions dance in the cyber breezes, while the buzz o' anticipation fills the air.\n");

        System.out.println("\nSettin' foot upon The Pirate Bay's digital shores, ye can't help but ponder the choices awaitin' ye. \n" +
                "The pursuit o' that new game torrent might've led ye here, but the possibilities stretch as far as the digital horizon.\n");

        System.out.println("\nWelcome to The Pirate Bay, where legends of the high binary seas come to life!\n");
        Main.enterToContinue();

        pirateBay();

    }

    public static void pirateBay()
    {
        if(library)
        {
            if(textbook)
            {
                System.out.println("Arr, ye've secured the coveted torrent ye sought, and ye've made a true pirate's promise to share the class tome with yer matey.\n");

                System.out.println("A fine haul and a loyal heart – the high binary seas have treated ye well, me heartie!\n");
                Main.enterToContinue();
            }
            else
            {
                System.out.println("Ye've got yer hands on the prized torrent, but ye missed the chance to honor the request of a fellow pirate.\n");

                System.out.println("Fear not, there be more chances ahead, and ye'll keep that promise in the next digital voyage.\n");
                Main.enterToContinue();
            }
        }
        else
        {
            System.out.println("Though the textbook slipped through yer grasp this time, ye've captured the digital treasure ye set out for.\n");

            System.out.println("With determination in yer heart, ye'll continue the search and ensure yer matey gets their hands on the class tome soon.\n");
            Main.enterToContinue();
        }

        System.out.println("\nWith yer ultimate goal achieved, the digital horizon stretches out before ye like an endless sea of opportunities.\n");

        System.out.println("The high binary seas be full of uncharted territory and bountiful treasures, and as ye stand on the brink of new adventures,\n");

        System.out.println("ye can't help but wonder where yer digital piracy journey will take ye next. Set sail, me heartie, for the horizon beckons!\n");
        Main.enterToContinue();

        System.out.println("What be your next plan? (1/2/3/4/5)\n");

        System.out.println("1. Explore the Pirate Bay: \n" +
                "Be on the lookout for other treasures, more torrents to plunder...");

        System.out.println("2. Engage in Digital Trade: \n" +
                "Snag the new game torrent and dedicate some time to seeding it for yer fellow buccaneers...");

        System.out.println("3. Set Sail for New Adventures: \n" +
                "Whispers tell of bountiful treasures awaitin' in the uncharted binary seas...");

        System.out.println("4. Venture to Treacherous Waters: \n" +
                "Upgradin' yer vessel with a Tor hull, sail the treacherous waters of the darkweb depths. \n" +
                "The risk be far greater than anything you've encountered, but the plunder be worth it...");

        System.out.println("5. Go Legit: \n" +
                "Ye've had yer fill of piracy and be considerin' the path of buyin' software. It may cost more, but the waters be calmer...");
        askEnding();
        Ending.endingEnd();
    }
    public static void askEnding()
    {
        String input = scan.nextLine();
        switch(input)
        {
            case "1":
                Ending.ending1();
                break;
            case "2":
                Ending.ending2();
                break;
            case "3":
                Ending.ending3();
                break;
            case "4":
                Ending.ending4();
                break;
            case "5":
                Ending.ending5();
                break;
            default:
                System.out.println("(Ye must enter 1, 2, 3, 4, or 5 to make a choice, matey!)");
                askEnding();
                break;

        }
    }

    public static void healthCheck()   {
        if(Player.health == 0)
        {
            System.out.println("\n\nyou are dead.\n\n*RE4 Leon death sound*");
            System.exit(0);

        }
    }


}
