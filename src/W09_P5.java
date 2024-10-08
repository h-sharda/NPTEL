import java.util.Scanner;
public class W09_P5{

    static int maxZeros(int n){
        int ans =0;
        int currentlen =0;
        while ( n> 0){
            if ( (n&1) == 1){
                if (currentlen > ans) ans = currentlen;
                currentlen = 0;
            }
            else currentlen++;

            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.print(maxZeros(n));

    }

}