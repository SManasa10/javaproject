public class MinMax {
    public static void main(String[] args) {
        int[] arr = {5, 10, 3, 20};

        int min = arr[0];
        int max = arr[0];

        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
