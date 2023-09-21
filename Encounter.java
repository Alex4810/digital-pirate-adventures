import java.util.Scanner;
import java.util.Random;

public class Encounter {

    private static final Random roll = new Random();
    private static final Scanner scan = new Scanner(System.in);
    public static boolean textbook = false;

    public static void email()//email
    {
        System.out.println("First, let's cast our eyes upon our electronic treasure chest and see if we've plundered any digital messages.");
        Main.wait(5);
        System.out.println("Ahoy, it seems there be a fresh scroll in the inbox!");
        Main.wait(3);
        System.out.println("Enter yer secret passphrase to unfurl the message, matey:");
        String input = scan.nextLine();
        Main.wait(1);
        System.out.println("[Hey what's up, the torrent file for that new game got released this morning." +
                "\nps if you get the chance could you send me the textbook for the class? ty.]");
        Main.wait(10);
        System.out.println("\nHmm, it be lookin' like we ought to make a course for The Pirate Bay." +
                "\nBut mayhaps we should pay a visit to the library if fortune smiles upon us.");
        libOrSea();
    }
    public static void libOrSea()
    {
        System.out.println("1. Go to the Library (1)\n" +
                "2. Sail straight to The Pirate Bay (2)");
        String ans = scan.next();
        switch (ans)
        {
            case "1":
                System.out.println("Aye, matey! To the Library Genesis we shall sail first! \n" +
                        "Knowledge be our treasure today!\n");
                Main.wait(5);
                library();
                break;
            case "2":
                System.out.println("There be no time to waste! Arrr, hoist the anchor! \n" +
                        "We'll be setting a course straight for The Pirate Bay, adventure awaits!\n");
                Main.wait(5);
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
        Main.wait(10);
        System.out.println("Standin' at the entrance, a salty dog named Keshav ambles over, boastin' a friendly grin. \n" +
                "He introduces himself as the guardian of this trove and extends a digital textbook to ye.");
        Main.wait(10);
        libraryResponse();
    }
    public static void libraryResponse(){
        System.out.println("Be ye claimin' this tome, matey?(y/n)");
        String response = scan.nextLine();
        switch(response){
            case "y":
                textbook = true;
                System.out.println("With the enthusiasm of a scallywag findin' buried treasure, ye snatch the book. \n" +
                        "Ye tuck it away for future plunder, knowin' full well it'll be dispatched to one of yer shipmates. \n" +
                        "With booty in hand, ye press on with yer grand adventure.");
                Main.wait(15);
                stormIntro();
                break;
            case "n":
                System.out.println("With a polite but firm refusal, ye steer clear of the offer, \n" +
                        "continuin' yer escapade, a hearty 'no thanks' ringin' from yer lips.");
                Main.wait(15);
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
        Main.wait(2);
        System.out.println("Ye be sailin' onward, but a fearsome Bitstorm be upon us! \n" +
                "We'll need to muster all our courage and wit to navigate this tempest, \n" +
                "but I've no doubt we'll emerge triumphant on the other side, matey!\n");
        Main.wait(15);
        stormLightning();
    }

    public static void stormLightning(){
        Main.clearScreen();
        System.out.println("The skies 'round ye turn as dark as a coder's soul. \n" +
                "A taste of metal fills yer mouth, and the scent o' ozone stings yer nose. \n" +
                "The ship's deck quivers as metal objects begin to vibrate.\n");

        Main.wait(10);
        System.out.println("A Data Surge Lightning Strike be on the horizon! What be yer course, captain? (1/2/3):\n");

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
        Main.wait(5);
        stormWhirlwind();
    }
    public static void stormWhirlwind(){
        Main.clearScreen();
        System.out.println("The lightning strike be but a memory, and they say lightning don't strike the same spot twice. \n" +
                "Ye be prayin' that be true as ye forge ahead into the heart of the Bitstorm. \n" +
                "All of a sudden, the winds be howlin', and a data debris whirlwind be upon us!\n");
        Main.wait(10);
                System.out.println("What be our course, captain? (1/2/3)\n");

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
        Main.wait(5);
        stormEruption();
    }
    public static void stormEruption(){
        Main.clearScreen();
        System.out.println("With the whirlwind dissipated, a sense o' relief washes over ye, but ye know rest be not yet within reach! \n" +
                "From the depths of Davey Jones' locker, a deep rumbling sound echoes — a firewall eruption be upon us!\n");
        Main.wait(10);

        System.out.println("What be yer orders, captain? (1/2/3))\n");

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
        Main.wait(5);
        stormWave();
    }
    public static void stormWave(){
        Main.clearScreen();
        System.out.println("With the firewall behind us, it seems we be approachin' the end of the storm. \n" +
                "But rest be not yet ours, for lo and behold, a grey beard approaches! \n");
        Main.wait(10);

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
        Main.wait(5);
        stormEnd();
        Main.wait(10);
        privateerIntro();


    }


    public static void stormEnd()   {
        Main.clearScreen();
        System.out.println("With the Bitstorm behind us, we set our course forward, onward to new digital horizons! \n" +
                "The high binary seas await, and there be adventures yet to come, me heartie!\n");
        Main.wait(10);
    }

    public static void stormRoll(int type, int input){
        switch(type)    {
            case 1:
                int storm1 = roll.nextInt(3)+1;
                if(input == storm1)  {
                    System.out.println("Alas! The lightning strikes true, and we've taken damage, \n" +
                            "but our spirit be unbreakable! We press on, aye!\n");
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
                }
                else    {
                    System.out.println("Aye, the ship slipped through unscathed, and we sail onward!\n");
                }
                break;
            case 4:
                int storm4 = roll.nextInt(3)+1;
                if(input == storm4)  {
                    System.out.println("The wave's wrath be upon us, and we've suffered packet loss! But our resolve be unshaken, and we sail on!\n");
                }
                else {
                    System.out.println("Luck be smilin' upon us! We've nimbly avoided the wave, and our voyage continues with nary a packet lost!\n");
                }
                break;
        }
    }

    public static void privateerIntro()
    {
        Main.clearScreen();
        System.out.println("With the Bitstorm finally behind us, the air clears, and we find ourselves bathed in the calm after the digital tempest. \n" +
                "The ship sails steadily as we breathe a sigh of relief, believin' the worst to be behind us. \n" +
                "Little did we know, me hearties, that the high binary seas still held a twist of fate in store.\n");

        Main.wait(15);

        System.out.println("As we sail these digital seas, a shadow looms — an ominous privateer, relentless in their pursuit of digital buccaneers like us. \n" +
                "Defeat could mean a digital brig and a life behind bars for our digital transgressions — it be a fate worse than death! \n" +
                "Stand ready, me hearties, for the clash of digital swords and bytes draws nigh!\n");
        Main.wait(15);
        Main.clearScreen();
        score = 0;
        privateerFight();
    }


    public static int score = 0;
    public static void privateerFight()
    {
        Ship.turn();
        Enemy.turn();

        int combination = Ship.attack * 10 + Enemy.attack;
        switch(combination)
        {
            case 11:
                System.out.println("Arrr! Our DDOS broadside be overwhelmin' their pitiful cannons afore they get a chance to fire!");
                score ++;
                Main.wait(5);
                break;
            case 12:
                System.out.println("Our DDOS broadside misses, but so does their swivel gun! A standoff, it be!");
                Main.wait(5);
                break;
            case 13:
                System.out.println("Our DDOS broadside misses, but their data snare chainshot be hittin' our ship! Brace yerselves, me hearties!");
                score --;
                Main.wait(5);
                break;
            case 21:
                System.out.println("Our VPN be activated, but it don't be hidin' us from their fiery firewall broadside. We be takin' a hit!");
                score --;
                Main.wait(5);
                break;
            case 22:
                System.out.println("Arrr! Our VPN be a lifesaver! We be hidin' our IP and evadin' their swivel gun shot with finesse!");
                score ++;
                Main.wait(5);
                break;
            case 23:
                System.out.println("Our VPN activates, but it be havin' no effect. Lucky for us, their data snare chainshot also be missin' the mark.");
                Main.wait(5);
                break;
            case 31:
                System.out.println("Our swivel gun misses, but their firewall broadside be as aimless as a drunken sailor!");
                Main.wait(5);
                break;
            case 32:
                System.out.println("The enemy's IP-tracker swivel gun hits us first, and it disables our attack. Blast it all!");
                score --;
                Main.wait(5);
                break;
            case 33:
                System.out.println("Our logic bomb disrupts their ability to fire a data snare chainshot. Take that, ye scallywags!");
                score ++;
                Main.wait(5);
                break;
            default:
                System.out.println("[bug check] combination: " + combination );
                break;

        }
        fightHealthCheck();

    }
    public static void fightHealthCheck(){
        if(Ship.health == 0)
        {
            System.out.println("died");
        }
        else if(score > 1)  {
            System.out.println("Victory, me hearties! With a flurry of well-placed attacks and cunning maneuvers, ye've inflicted enough damage upon the enemy ship to cripple their pursuit! \n" +
                    "The enemy privateer be left floundering in the digital wake, and ye make yer escape with yer freedom intact. \n" +
                    "Ye've outwitted 'em this time, and the binary seas are once again yours to explore! \n" +
                    "Onward to The Pirate Bay!");
            Main.wait(15);
            pirateBayIntro();
        }
        else {
            privateerFight();
        }
    }


    public static void pirateBayIntro()
    {
        System.out.println("Af'er a harrowing journey through the turbulent seas o' the digital realm, yer vessel finally drops anchor at The Pirate Bay. \n" +
                "This fabled sanctuary fer buccaneers, nestled deep within the binary tides, teems with activity.\n");
        Main.wait(10);
                System.out.println("As ye make landfall, the sights an' sounds o' fellow pirates from all corners o' the digital world surround ye. \n" +
                "Flags adorned with the symbols o' diverse factions dance in the cyber breezes, while the buzz o' anticipation fills the air.\n");
        Main.wait(10);
        System.out.println("Settin' foot upon The Pirate Bay's digital shores, ye can't help but ponder the choices awaitin' ye. \n" +
                "The pursuit o' that new game torrent might've led ye here, but the possibilities stretch as far as the digital horizon.\n");
        System.out.println("Welcome to The Pirate Bay, where yer digital piracy escapade may find its heart-poundin' climax or lead ye to uncharted realms. \n" +
                "The decisions be in yer hands, me heartie!");
        Main.wait(10);

        pirateBay();

    }

    public static void pirateBay()
    {
        Main.clearScreen();
        System.out.println("As ye set foot on the digital shores of The Pirate Bay, ye sense yer quest's culmination. \n" +
                "The torrent ye've sought fer so long now rests in yer grasp, awaitin' its rightful plunderin'.");

        if(textbook)    {
            System.out.println("With the game torrent secured in yer grasp, another call to duty echoes in yer mind. \n" +
                    "Yer mate, the one who whispered tales of this treasure, asked ye for a simple favor - to share the class textbook. \n" +
                    "Ye send the tome of knowledge sailin' to yer friend, offerin' gratitude for the precious information.\n");
        }
        Main.wait(20);
        if(textbook){
            System.out.println("\"After a long and treacherous voyage, ye be standin' victorious. The torrent be safe in yer grasp, and yer mate possesses a copy of the textbook. \n" +
                    "As ye gaze upon the bustling hub of activity within The Pirate Bay, ye ponder yer next course of action...\n");
        }
        else {
            System.out.println("\"After a long and treacherous voyage, ye be standin' victorious. The torrent be safe in yer grasp. \n" +
                    "As ye gaze upon the bustling hub of activity within The Pirate Bay, ye ponder yer next course of action...\n");
        }
        Main.wait(5);
        System.out.println("(1/2/3/4/5)\n");
        Main.wait(2);
        System.out.println("1. Explore the Pirate Bay: \n" +
                "Be on the lookout for other treasures, more torrents to plunder...");
        Main.wait(2);
        System.out.println("2. Engage in Digital Trade: \n" +
                "Snag the new game torrent and dedicate some time to seeding it for yer fellow buccaneers...");
        Main.wait(2);
        System.out.println("3. Set Sail for New Adventures: \n" +
                "Whispers tell of bountiful treasures awaitin' in the uncharted binary seas...");
        Main.wait(2);
        System.out.println("4. Venture to Treacherous Waters: \n" +
                "Upgradin' yer vessel with a Tor hull, sail the treacherous waters of the darkweb depths. \n" +
                "The risk be far greater than anything you've encountered, but the plunder be worth it...");
        Main.wait(2);
        System.out.println("5. Go Legit: \n" +
                "Ye've had yer fill of piracy and be considerin' the path of buyin' software. It may cost more, but the waters be calmer...");

        String input = scan.nextLine();




    }

    public static void healthCheck()   {
        if(Ship.health == 0)
        {
            System.out.println("you are dead.\n*RE4 Leon death sound*");
            System.exit(0);
        }
    }


}
