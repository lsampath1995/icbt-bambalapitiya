
package animals;

public class Cat implements Animal {
    
    @Override
    public void move() {
        
	    System.out.println("Cat is moving");
    }

    @Override
    public void consume() {
        
	    System.out.println("Cat is eating");
    }
}
