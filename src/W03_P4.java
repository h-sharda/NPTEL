import java.util.*;

public class W03_P4{
    public static void main(String[] args) {

        String choice = "";
        Scanner input = new Scanner(System.in);
        int prod=1, count =0, temp;
        float sum =0, average;

        while (true){
            choice = input.nextLine();

            if ( choice.equals("q")) break;

            temp = Integer.parseInt(choice);
            sum += temp;
            prod *= temp;
            count ++;

        }

        if (count > 0 ) {
            average = sum/count;
            System.out.println("Product is: " + prod);
            System.out.print("Average is: " + average);
        }
    }
}