/**
 * Created by Iammasariya on 6/13/2016.
 */
public class Car extends Observer {
    int carNumer;
    float radius;

    public Car(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }

    public int getCarNumer(){
        return carNumer;
    }

    public void setCarNumer(int numer)
    {
        carNumer = numer;
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float rad)
    {
        radius = rad;
    }

    @Override
    public void update() {
        System.out.println("");
    }
}
