public class Sloop extends Ship{

    public Sloop()
    {
        super(200, 100,10,4,10,0,50);
    }
    public int broadsideType = 0;
    public int sailType = 0;

    public int riggingType = 0;
   @Override
    public void customize()
    {
        System.out.println("A sloop! Prioritizin' speed and maneuverability, a fine choice, captain!");
        System.out.println("Now let's take a look at yer ship...\n");
        setBroadside(broadsideType);
        setSails(sailType, dodge, speed);
        setRigging(riggingType, armor, speed);

    }

    @Override
    public void turn()
    {
        System.out.println("turn");
    }




}
