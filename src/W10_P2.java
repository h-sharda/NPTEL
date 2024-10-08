import java.util.*;
public class W10_P2 {
    public static void main(String[] args) {
        try{
            byte[] barr={'N','P','T','E','L','-','J','A','V','A','J','U',
                    'L','-','N','O','C','C', 'S','\n'};
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();

            // Write the appropriate code to get specific indexed byte value and its corresponding char value.
            System.out.println(barr[n]);
            System.out.print((char)barr[n]);

        } // End of try block
        catch (Exception e){
            // print the required message here
            System.out.print("Error: Exception occoured");
        }

    }
}