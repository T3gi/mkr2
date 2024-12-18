package mkr2;

public interface PersonFactory {
    Person createPerson(String name, int x, int y);
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String name, int x, int y);
}
