import java.util.Scanner;
class W03_P3{
    //Create recursive method to find factorial of a number
    public static int factorial (int n){
        if (n<0) return -1;
        if (n==0) return 1;
        else return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        System.out.print(factorial(x));
    }
}