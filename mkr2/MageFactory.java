package mkr2;

import java.util.ArrayList;
import java.util.List;

public class MageFactory implements PersonFactory{
    private List<Observer> observers = new ArrayList<>();
    @Override
    public Person createPerson(String name, int x, int y) {
        notifyObservers(name, x, y);
        return new Mage(name, 100, 40, x, y);
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
            observer.update("Mage " + name + " is beeing seen on the (" + x + ", " + y + ") position");
        }
    }
}
