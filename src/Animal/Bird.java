package src.Animal;

public class Bird extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Tweet!!");
    }
    @Override
    public void move(){
        System.out.println("Fly!");
    }
}