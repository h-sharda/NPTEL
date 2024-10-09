import java.util.*;

class IllegalArgumentException extends Exception {
    public IllegalArgumentException(String message) {
        super(message);
    }
}

public class W05_P1 {
    public static void main(String[] args) {
        // int n = 18;
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        trynumber(n);
    }
// write a function to check an integer as a parameter and throws an exception if the number is odd.

    public static void trynumber(int n){
        // try catch implementation here

        try {
            checkEvenNumber(n); // This will throw an exception
            System.out.print(n +" is even.");
        }

        catch (IllegalArgumentException e) {
            System.out.print("Error: " + n +e.getMessage());
        }

    }


    public static void checkEvenNumber(int number) throws IllegalArgumentException {
        // throw exception in required format here
        if (number %2 != 0 ) {
            throw new IllegalArgumentException(" is odd.");
        }
    }
}