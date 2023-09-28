import java.util.Scanner;
public class Sloop extends Ship{
    public static Scanner scan = new Scanner(System.in);
    public Sloop()
    {
        super(200, 100,10,9,100,7,50);
    }
    public int broadsideType = 0;
    public int sailType = 0;

    public int riggingType = 0;
   @Override
    public void customize()
    {
        System.out.println("A sloop! Prioritizin' speed, a fine choice, captain!");
        System.out.println("Now let's take a look at yer sloop...\n");
        setBroadside(broadsideType);


        System.out.println("What kind o' sails be on yer ship? (1/2)" +
                "1. VPN sails - ");

    }

    @Override
    public void turn()
    {
        System.out.println("turn");
    }




}
