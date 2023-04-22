package PetStore;

public interface Sound {
    default void shout(String voice) {
        System.out.println(voice);
    }
}
class Duck extends Animal implements Pet,Sound{
    private String name;

    protected Duck(String name) {
        super(2);
        this.name=name;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" likes to eat small fish and shrimp.");
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
        System.out.println(getName()+" likes to paddle.");
    }

    @Override
    public void shout(String voice){
        Sound.super.shout(voice);
        System.out.println("I am a yellow duck.");
    }
}