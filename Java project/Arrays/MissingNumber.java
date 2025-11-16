public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];
        int missing = 57;

        int index = 0;
        for (int i = 1; i <= 100; i++) {
            if (i != missing)
                arr[index++] = i;
        }

        int sum100 = 100 * 101 / 2;
        int sumArr = 0;
        for (int n : arr) sumArr += n;

        System.out.println("Missing number = " + (sum100 - sumArr));
    }
}
