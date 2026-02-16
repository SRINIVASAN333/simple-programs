public class find_leaders_v2 {
    public static void main(String[] args) {
        int[] nums ={9,10,8,7,6,5};
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>max){
                max=nums[i];
                System.out.println(nums[i]+" is a leader");
            }
        }
    }
}
