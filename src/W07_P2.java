import java.util.Scanner;
class W07_P2
{
    // main() method start  
    public static void main (String[] args) {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter odd numbers for rows and columns to get perfect Swastika.");
        System.out.print("Enter total rows: ");
        rows = sc.nextInt();
        System.out.print("Enter total columns: ");
        cols = sc.nextInt();

        // close Scanner class  
        sc.close();

        // call swastika() method that will design Swastika for the specified rows and cols  
        swastika(rows, cols);
    }

    static void swastika(int rows, int cols) {
        for (int i=0; i< rows; i++){
            for (int j= 0; j< cols; j++){
                if(i==0){
                    if(j == 0 || j>= cols/2) System.out.print("*");
                    else System.out.print(" ");
                }
                else if(i< rows/2){
                    if (j==0 || j== cols/2)System.out.print("*");
                    else if(j < cols/2) System.out.print(" ");
                }
                else if(i == rows/2) {
                    System.out.print("*");
                }
                else if(i< rows-1){
                    if(j==cols-1 || j== cols/2) System.out.print("*");
                    else System.out.print(" ");
                }
                else{
                    if(j<= cols/2 || j == cols-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }
            if(i != rows-1)System.out.print("\n");
        }
    }
}
