package mkr2;

import java.util.ArrayList;
import java.util.List;

public class Archer implements Person {
    String name;
    int health;
    int damage;
    int x;
    int y;
    private List<Observer> observers = new ArrayList<>();

    public Archer(String name, int health, int damage, int x, int y) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y){
        System.out.println("Archer " + this.name + " moved to (" + x + ", " + y +")");
        this.x = x;
        this.y = y;
    }
    @Override
    public void atack(){
        System.out.println("Archer " + this.name + " dealed " + this.damage + " damage");
    }
}
