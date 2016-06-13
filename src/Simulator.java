import java.util.Random;
import java.util.Scanner;

/**
 * Created by Iammasariya on 6/13/2016.
 */
public class Simulator {
    public static Subject subject = new Subject();
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            Car c = new Car(subject);
            Random rand = new Random();
            int number = rand.nextInt(20) + 1;
            c.setRadius(15);
            c.setCarNumer(number);
        }


    }
}
