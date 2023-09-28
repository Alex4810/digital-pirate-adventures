public class Frigate extends Ship{

    public Frigate()
    {
        super(350,250,7,3,20,3,100);
    }


    @Override
    public void customize()
    {
        System.out.println("A frigate! Lookin' to balance out all aspects o' yer ship, a fine choice, captain!");
        System.out.println("Arr, now let's take a look at yer ship...");
        setBroadside(broadsideType);
        setSwivel(swivelType);
        setSails(sailType, dodge, speed);
        setRigging(riggingType, armor, speed);

    }

    @Override
    public void turn()
    {
        System.out.println("turn");
    }



}
