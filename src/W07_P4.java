import java.util.Scanner;

public class W07_P4{

    private static boolean isPrime(int x){
        if (x < 2) return false;
        for ( int i =2; i<= (int) Math.sqrt(x) ; i++){
            if(x%i == 0) return false;
        }
        return true;
    }

    static int primeSum(int x, int y){
        int sum =0;

        for(int i =x; i<= y; i++){
            if(isPrime(i)) sum+= i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.print(primeSum(x, y));
    }
}