import java.util.Scanner;
public class W01_P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to input an integer
        //System.out.print("Input an integer: ");

        // Read the integer from the user
        long n = input.nextLong();

        // Calculate and display the sum of the digits
        System.out.print("The sum of the digits is: " + sumDigits(n));
    }
    public static long sumDigits(long n){
        long temp = n;
        long sum =0;
        while ( temp >0){
            sum += temp%10;
            temp /= 10;
        }
        return sum;
    }
}