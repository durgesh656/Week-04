package annotations.use_override;

public class Dog extends Animal{
    @Override
    void makeSound() {  // Overriding the parent class method
        System.out.println("Bark Bark !");
    }
}
