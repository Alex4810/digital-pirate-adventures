public class Fight {

    public static boolean initiative(int player, int enemy)
    {
        return player >= enemy;
    }

    public static void turn(Player player, Enemy enemy)
    {
        if (initiative(Player.initiative, Enemy.initiative))
        {
            System.out.println("playergofirst");
            Player.turn();
        }
        else {
            System.out.println("enemygofirst");
        }


    }
























    public static void intro()
    {
        Main.clearScreen();
        System.out.println("With the Bitstorm finally behind us, the air clears, and we find ourselves bathed in the calm after the digital tempest. \n" +
                "The ship sails steadily as we breathe a sigh of relief, believin' the worst to be behind us. \n" +
                "Little did we know, me hearties, that the high binary seas still held a twist of fate in store!\n");

        Main.enterToContinue();

        System.out.println("\nAs we sail these digital seas, a shadow looms — an ominous privateer, relentless in their pursuit of buccaneers like us. \n" +
                "Defeat could mean a life behind bars for our digital transgressions — it be a fate worse than death! \n" +
                "Stand ready, me hearties, for the clash of digital swords and bytes draws nigh!\n");
        Main.enterToContinue();
        Main.clearScreen();
    }





}
