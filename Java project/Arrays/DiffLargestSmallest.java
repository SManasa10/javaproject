public class DiffLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 30};

        int min = arr[0], max = arr[0];

        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        System.out.println("Difference = " + (max - min));
    }
}
