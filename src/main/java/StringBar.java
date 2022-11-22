import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {
    boolean happyHour = false;

    public StringBar(){
        this(new ArrayList<>());
    }
    public StringBar(List<BarObserver> observers){
        super(observers);
    }
    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }
}
