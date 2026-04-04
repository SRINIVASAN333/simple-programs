class ToFind2ndMax {
    public static void main (String[] args){
        int[] a = {10, 3, 4, 5, -9, 6};
        int max1 = a[0];
        int max2 = Integer.MIN_VALUE;
        for(int i = 1; i < a.length; i ++){
            if (a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }
            else if ( a[i] < max1 && a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.println ("2nd Maximum = " + max2);
    }
}