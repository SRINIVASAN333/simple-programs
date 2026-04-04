import java.util.*;

public class Tcs1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int star = 0;
        int hash = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '*')
                star++;
            else if(ch == '#')
                hash++;
        }

        int result = star - hash;
        System.out.println(result);
    }
}