import java.util.Scanner;
import java.util.Set;

public class unique_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] num=new String[9];
        num={1,1,1,2,2,2,3,3,3};
        Set<String> immutableSet = Set.of(num);
        System.err.println(immutableSet);

        
        
       
    }
}
