// *    *
// **  **
// ******
// ******
// **  **
// *    *
import java.util.Scanner;
public class W12_P3 {
    public static void main(String[] args) {
        //  int n = 7; // Number of rows (should be odd for symmetry)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*(n-i-1); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            if(i != 0) System.out.println();
        }
    }
}