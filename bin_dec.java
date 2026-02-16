
public class bin_dec {
    public static void main(String[] args) {
        String bin = "101";
        int dec = 0;
        int len = bin.length();
        
        for (int i = 0; i < len; i++) {
            int digit = bin.charAt(len - 1 - i) - '0';
            dec += digit * (int) Math.pow(2, i);
        }
        
        System.out.print(dec);
    }
}