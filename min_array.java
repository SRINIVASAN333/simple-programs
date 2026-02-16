
public class min_array {
    public static void main(String[] args) {
        
        int[] a =  {10,3,4,5,9,6};
        int min=a[0];
        
        for (int i = 1; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print(" Minimum "+ min);
        
    }
}
