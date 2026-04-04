class ArrayRotation {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 1, 2};

        int n = a.length;
        boolean isRotation = true;

        if (a.length != b.length) {
            isRotation = false;
        } else {
            int start = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == b[0]) {
                    start = i;
                    break;
                }
            }

            if (start == -1) {
                isRotation = false;
            } else {
                for (int i = 0; i < n; i++) {
                    if (a[(start + i) % n] != b[i]) {
                        isRotation = false;
                        break;
                    }
                }
            }
        }

        if (isRotation)
            System.out.println("Rotation");
        else
            System.out.println("Not Rotation");
    }
}
