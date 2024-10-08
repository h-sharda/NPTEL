import java.util.Scanner;
public class W12_P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];

        for (int i=0; i< 5; i++){
            String S = sc.next();
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (S.charAt(j) - '0');
                arr[i][j] = arr[i][j] == 1? 0: 1;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            if (i != 4) System.out.println();
        }
    }
}