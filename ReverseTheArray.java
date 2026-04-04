class ReverseTheArray {
    public static void main (String[] args){
        int[] a = { 5, 9, 3, 4, 1};
        int i = 0;
        int j = a.length - 1;
        while(i < j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array : ");
        for(int k = 0; k < a.length; k++){
            System.out.println(a[k] + " ");
        }
    }
}