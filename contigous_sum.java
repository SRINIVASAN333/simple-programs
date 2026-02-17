
import java.util.Scanner;

public class contigous_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k;
        System.out.println("Enter K: ");
        k=in.nextInt();
        int[] arr={1,4,3,2,5,1,1,3};
        int largest=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if ((arr[i]+arr[j])==k){
                    largest=2;
                    break;
                }
                else if((arr[i]+arr[j])>k){
                    break;
                }
                else{
                    for(int m=0;m<arr.length;m++){
                        if((arr[i]+arr[j]+arr[m])>=6){
                            largest=3;
                            break;
                        }
                    }
                }
            }
        }
        System.err.println(largest);
    }
}
