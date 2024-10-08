import java.util.*;
public class W10_P4 {
    public static void main(String[] args) {
        try{
            String s1="NPTELJAVA";
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            char c='a';

            //Replace the char in string "s1" with the char "a" at index "n" and print the modified string.

            if (n> s1.length()) throw new Exception();

            String ans = s1.substring(0, n);

            ans += 'a';

            ans += s1.substring(n+1);

            System.out.print(ans);

        }
        catch (Exception e){
            System.out.print("exception occur");
        }
    }
}