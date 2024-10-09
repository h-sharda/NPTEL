interface Flyable {
    // Declare the abstract method "fly_obj" that classes implementing this interface must provide
    void fly_obj();
}
// Implement the Spacecraft class which implements the Flyable interface
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying");
    }
}

// Implement the Airplane class which implements the Flyable interface
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying");
    }
}

// Implement the Helicopter class which implements the Flyable interface
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.print("Helicopter is flying");
    }
}
public class W05_P4 {
    public static void main(String[] args) {
        // Create an array of Flyable objects, including a Spacecraft, Airplane, and Helicopter
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};

        // Iterate through the array and call the "fly_obj" method on each object
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}