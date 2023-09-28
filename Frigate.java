import java.util.Scanner;
public class Frigate extends Ship{

    public Frigate()
    {
        super(350,250,7,5,200,6,100);
    }


    @Override
    public void customize()
    {
        System.out.println("A frigate! Lookin' to minimize yer weaknesses, a fine choice, captain!");
        System.out.println("Arr, now let's take a look at yer ship...");
        setBroadside(broadsideType);
        setSwivel(swivelType);

    }

    @Override
    public void turn()
    {
        System.out.println("turn");
    }



}
