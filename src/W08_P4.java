import java.util.Scanner;
import static java.lang.System.out;
// Import the required package(s) and/or class(es)
// main class is created
public class W08_P4{
    public static void main(String[] args) {
        // Scanner object is created
        Scanner scanner = new Scanner(System.in);
        // Read String input using scanner class
        String courseName = scanner.nextLine();
        // Print the scanned String
        out.print("Course: " + courseName);

    }
}