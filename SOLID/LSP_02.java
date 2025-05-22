package SOLID;

public class LSP_02 {
    
    /*
     * TASK:
     * The polymorphic function move expect the same behaviour
     * for all birds, but this isn't the case.
     * Fix this to obey the LSP (Liskov Substitution Principle)!
     */

    public static class Bird {
       public void eat() {
            System.out.println("The bird is eating");
        }
    }
    public interface Fly {
        void fly();
        
    }

    public static class Sparrow extends Bird implements Fly {
        @Override
        public void fly() {
            System.out.println("The sparrow is flying");
        }
    }

    public static class Penguin extends Bird {
    }
       public static void move(Fly flyingBird) {
            flyingBird.fly();
        }
    
        public static void eat(Bird bird) {
            bird.eat();   
        }

    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        move(sparrow); 
        eat(sparrow);
        eat(penguin); 
    }
}
