public class product_v2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int product=1;
        for (int i = 0; i < nums.length; i++) {
            if(i==0){
                product*=nums[i+1:];
            }
        }
    }
}
