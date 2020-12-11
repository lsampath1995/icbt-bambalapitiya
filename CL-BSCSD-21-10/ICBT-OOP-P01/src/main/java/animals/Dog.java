
package animals;

public class Dog implements Animal {
    
    @Override
    public void move() {
        
	    System.out.println("Dog is moving");
    }

    @Override
    public void consume() {
        
	    System.out.println("Dog is eating");
    }
}
