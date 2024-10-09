interface Playable {
    // Declare the abstract method "play" that classes implementing this interface must provide
    void play();
}
// Implement the Volleyball class which implements the Playable interface
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing volleyball");
    }
}

// Implement the Basketball class which implements the Playable interface
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.print("Playing basketball");
    }
}

// Implement the Football class which implements the Playable interface
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing football");
    }
}
public class W05_P5 {
    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}