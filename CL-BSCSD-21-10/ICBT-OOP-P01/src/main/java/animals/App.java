
package animals;

public class App {
    public static void main(String [] args) {
        
         Animal animal1 = new Dog();
         Animal animal2 = new Cat();
	 Animal animal3 = new Rabbit();
        
         animal1.move();
         animal2.consume();
	 animal3.move();
        
    }
}
