public class sec_min_array {
    public static void main(String[] args) {
        
        int[] a =  {10,3,-4,5,-9,6};
        int min=a[0];
        
        for (int i = 1; i < a.length; i++) {
            if(a[i]<min){
                min=a[i];
            }
        }
        int sec_min=a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > min && a[i] < sec_min) {
                sec_min = a[i];
            }
        }
        System.out.print("2nd Minimum "+ sec_min);
        
    }
}
