public class program2 {
    public static void main(String[] args) {
        
        int i, j, b = 1, n = 6;
        
        for (i = 1; i <= n; i++) { 
            for (j = 0; j < i; j++) {
                System.out.print(b + " ");
                b++;
            }
            System.out.println();
        }
    }
}