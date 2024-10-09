import java.util.Scanner;

public class W01_P4 {

    public static void main(String[] args)

    {
        int i, j, n, k = 1;

        //System.out.print("Input number of rows : ");

        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (i =0; i < n; i++){
            for (j = 0; j <= i; j++ ){
                System.out.printf("%d ",k);
                k++;
            }
            if (i == n-1) break;
            else System.out.printf("\n");
        }

    }
}