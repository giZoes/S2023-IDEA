package PetStore;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){this.legs=legs;}
    public abstract void eat();
    public void walk(){
        System.out.println("Walks with "+legs+" legs.");
    }
}
class Spider extends Animal{

    protected Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider likes to eat flyings on the web.");
    }
}
