import mkr2.*;

public class Main {
    public static void main(String[] args) {
        Observer observer = new ConcreteObserver("Spawn");
        PersonFactory personFactory = createFactory("warrior");
        personFactory.registerObserver(observer);
        Person warior = personFactory.createPerson("William", 5, 5);

        warior.atack();

        personFactory = createFactory("archer");
        personFactory.registerObserver(observer);
        Person archer = personFactory.createPerson("Armin", 10, 10);
        archer.atack();

        personFactory = createFactory("mage");
        personFactory.registerObserver(observer);
        Person mage = personFactory.createPerson("Merlin", 15, 15);
        mage.atack();
    }

    public static PersonFactory createFactory(String type){
        switch (type){
            case "warrior": return new WarriorFactory();
            case "mage": return new MageFactory();
            case "archer": return new ArcherFactory();
            default: return null;
        }
    }
}