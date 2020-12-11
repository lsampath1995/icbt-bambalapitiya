
package animals;

public class Rabbit implements Animal {
    
    @Override
    public void move() {
        
	    System.out.println("Rabbit is moving");
    }

    @Override
    public void consume() {
        
	    System.out.println("Rabbit is eating");
    }
    
}
