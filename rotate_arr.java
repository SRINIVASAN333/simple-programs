
import java.util.Scanner;

public class rotate_arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k;
        k=in.nextInt();
        int[] nums = {1, 2, 3, 4, 5};
        
        
        for(int j=0;j<k;j++){
            int firstElement = nums[0];
            for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        
        nums[nums.length - 1] = firstElement;

        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}