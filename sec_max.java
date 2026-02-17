public class sec_max {
    public static void main(String[] args) {
        
        int[] a = {10, 3, -4, 5, -9, 6};
        int max = a[0];
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        int sec_max = a[0]; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max) {
                sec_max = a[i];
                break;
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > sec_max && a[i] < max) {
                sec_max = a[i];
            }
        }
        
        System.out.print("2nd Maximum " + sec_max);
    }
}