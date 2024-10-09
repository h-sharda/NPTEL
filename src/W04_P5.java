// Prefixed Fixed Code:
import java.util.Scanner;

public class W04_P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        // Use for or while loop to sum first n positive even numbers starting from 0 which are
        // divisible by 3.
        int i =0;
        while (i <= 2*(n-1)){
            sum += i;
            i += 6;
        }
        System.out.print("Sum: "+sum);// Suffixed Fixed Code:
        sc.close();
    }
}