public class hex_add {
    public static void main(String[] args){
        String dec_to_hex(int n){
            String hex="";
        for(int i=0;n>0;i++){
             r=n%16;
            if(r<10){
                hex=r+hex;
            }else {
                r=(r-10)+'A';
                hex=(char)r+hex;
            }
            n=n/16;
                    
        }
        
        return (hex);
        }
        Scanner in = new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st hex value");
        a=in.nextInt();
        System.out.println("Enter 2nd hex value");
        b=in.nextInt();
        result=dec_to_hex(a);
        System.out.println(result)
    }
}
