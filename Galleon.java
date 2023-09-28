import java.util.Scanner;
public class Galleon extends Ship{

    public Galleon()
    {
        super(500,200,4,3,300,4,150);
    }


    @Override
    public void customize()
    {
        System.out.println("Ah, a galleon! A mighty sailin' vessel, a fine choice, captain!");
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
