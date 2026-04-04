class ProductArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int n = a.length;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        int left = 1;
        int right = 1;
        for (int i = 0; i < n; i++) {
            result[i] = result[i] * left;
            left = left * a[i];

            result[n - 1 - i] = result[n - 1 - i] * right;
            right = right * a[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
