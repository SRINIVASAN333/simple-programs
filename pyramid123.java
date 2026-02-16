import java.util.Scanner;

class pyramid_123{
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n value: ");
        n = in.nextInt();
        
        for (int i = 1; i<=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                for(int l=k+1;l<k;l++){
                    System.out.print(k);
                    System.out.print(l);
                    System.out.print(k);
                }
            }
            System.out.println();
        }
        
    }
}