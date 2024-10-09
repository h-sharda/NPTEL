import java.util.Scanner;

class QuestionScope {
//Create the method sum() to find the sum of two numbers.
//Create the static method multiply() to find the product of two numbers.

    public int sum(int a, int b){
        return a+b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
}

public class W04_P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = 0, prod = 0;
        QuestionScope st = new QuestionScope(); // Create an object to call non-
        // static method
        sum = st.sum(n1, n2); // Call the method
        prod = QuestionScope.multiply(n1, n2);  // Create an object to call
        // static method
        System.out.println("Sum: "+sum);
        System.out.print("Product: "+prod);
        sc.close();
    }
}