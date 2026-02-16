public class fibonacci {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5};
        int[] new_arr=new int[arr.length];
        if (arr.length > 0) new_arr[0] = 0;
        if (arr.length > 1) new_arr[1] = 1;
        for (int i=2;i<arr.length;i++){
            new_arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < new_arr.length; i++) {
            System.err.println(new_arr[i]);
        }
    }
    
}
