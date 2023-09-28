public class Galleon extends Ship{

    public Galleon()
    {
        super(500,200,4,3,30,4,150);
    }


    @Override
    public void customize()
    {
        System.out.println("Ah, a galleon! A mighty sailin' vessel for the toughest of fights, a fine choice, captain!");
        System.out.println("Arr, now let's take a look at yer ship...");
        setBroadside(broadsideType);
        setSwivel(swivelType);
        setCrew(crewType);
        setSails(sailType);
        setRigging(riggingType);

    }

    @Override
    public void turn()
    {
        System.out.println("turn");
    }




}
