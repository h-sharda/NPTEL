import java.io.*;
import java.util.*;
public class W10_P3{
    public static void main(String[] args) {
        int c=0;
        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);
            String s1 = br.readLine();

            int ans = 0;
            for (int i =0; i< s1.length(); i++){
                char ch = Character.toLowerCase (s1.charAt(i));
                if (ch =='a' || ch =='e' || ch =='i'|| ch =='o'|| ch =='u'){
                    ans++;
                }
            }

            System.out.print(ans);

        } catch (Exception e){
            System.out.print(0);
        }

    } // end of main
} // end of class