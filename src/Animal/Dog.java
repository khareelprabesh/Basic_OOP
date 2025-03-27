package src.Animal;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Bark!!");
    }
    @Override
    public void move() {
        System.out.println("Run!!");
    }
}
