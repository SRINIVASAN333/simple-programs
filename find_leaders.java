public class find_leaders {
    public static void main(String[] args) {
        int[] nums={9,10,8,7,6,5};
        
        for (int i = 0; i < nums.length; i++) {
            boolean flag=true;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>nums[j]){
                    flag=false;
                }else{
                    flag=true;
                    break;
                }
            }
            if(flag){
                System.out.println(nums[i]+" is not a leader");
            }else{
                System.out.println(nums[i]+" is a leader");
            }
        }
    }
}
