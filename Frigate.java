public class Frigate extends Ship{

    public Frigate()
    {
        super(350,250,7,5,20,6,100);
    }


    @Override
    public void customize()
    {
        System.out.println("A frigate! Lookin' to balance out all aspects o' yer ship, a fine choice, captain!");
        System.out.println("Arr, now let's take a look at yer ship...");
        setBroadside(broadsideType);
        setSwivel(swivelType);
        setSails(sailType);
        setRigging(riggingType);

    }

    @Override
    public void turn()
    {
        System.out.println("turn");
    }



}
