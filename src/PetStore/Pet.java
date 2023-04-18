package PetStore;

interface Pet {
    String getName();
    void setName(String n);
    void play();
}
class Cat extends Animal implements Pet{
    private String name;
    protected Cat(String name) {
        super(4);
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" likes to eat mouse.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        name=n;
    }

    @Override
    public void play() {
        System.out.println(getName()+" likes playing the wool ball.");
    }
}
class Fish extends Animal implements Pet{
    private String name;
    protected Fish(String name) {
        super(0);
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" likes to eat little shrimp.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String n) {
        name=n;
    }

    @Override
    public void play() {
        System.out.println(getName()+" likes to swim in the pond.");
    }
    public void walk(){
        super.walk();
        System.out.println(getName()+" has no legs.");
    }
}
