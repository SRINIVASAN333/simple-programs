import java.util.Scanner;
class sumlen{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a={3,2,4,-2,4,1,1};
        System.out.println("Enter the value of k:");
        int k=in.nextInt();
        int maxlen=0;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum==k){
                    int length=j-i+1;
                    if(length>maxlen){
                        maxlen=length;
                    }
                }
            }
        }System.out.println("Longest length of sub array: "+maxlen);
    }
}