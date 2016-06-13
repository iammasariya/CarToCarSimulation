import java.util.ArrayList;
import java.util.List;

/**
 * Created by Iammasariya on 6/13/2016.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState()
    {
        return state;
    }

    public void setState(int state)
    {
        this.state = state;
    }

    public void attach(Observer observer)
    {
        observers.add(observer);
    }

    public void notifyAllObservers()
    {
        for(Observer o : observers)
        {
            o.update();
        }
    }
}
