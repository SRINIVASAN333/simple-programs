public class long_add {
    public static void main(String[] args) {
        String a = "1234567890";
        String b = "1234567890";
        String result = new String();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = digitA + digitB + carry;
            result=(sum % 10)+result;
            carry = sum / 10;
        }
        System.out.println(result);
    }
}