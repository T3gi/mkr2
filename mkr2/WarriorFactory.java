package mkr2;
import java.util.ArrayList;
import java.util.List;

public class WarriorFactory implements PersonFactory{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public Person createPerson(String name, int x, int y) {
        notifyObservers(name, x, y);
        return new Warrior(name, 150, 20, x, y);

    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String name, int x, int y) {
        for (Observer observer : observers) {
            observer.update("Warrior " + name + " is beeing seen on the (" + x + ", " + y + ") position");
        }
    }
}
