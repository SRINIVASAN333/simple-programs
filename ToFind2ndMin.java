
class ToFind2ndMin {
    public static void main (String[] args){
        int[] a = {10, 3, 4, 5, -9, 6};
        int min1 = a[0];
        int min2 = Integer.MAX_VALUE;
        for(int i = 1; i < a.length; i ++){
            if (a[i] < min1){
                min2 = min1;
                min1 = a[i];
            }
            else if ( a[i] > min1 & a[i] < min2){
                min2 = a[i];
            }
        }
        System.out.println ("2nd Minimum = " + min2);
    }
}