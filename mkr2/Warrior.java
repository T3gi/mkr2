package mkr2;


public class Warrior implements Person{
    String name;
    int health;
    int damage;
    int x;
    int y;


    public Warrior(String name, int health, int damage, int x, int y) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y){
        System.out.println("Warrior " + this.name + " moved to (" + x + ", " + y +")");
        this.x = x;
        this.y = y;
    }
    @Override
    public void atack(){
        System.out.println("Warrior " + this.name + " dealed " + this.damage + " damage");
    }
}
