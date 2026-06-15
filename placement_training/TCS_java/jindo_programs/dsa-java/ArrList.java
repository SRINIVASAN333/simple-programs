import java.util.*;
public class ArrList{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Jindo");
        list.add("Majala");
        list.remove("Jindo");
        list.set(0,"siva");
        
        for(String name : list){
            System.out.println(name);
        }
    }
}
