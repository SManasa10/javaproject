public class RemoveDuplicateReturn {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        
        System.out.println("Unique elements:");
        for (int i = 0; i < arr.length; i++) {
            boolean dup = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    dup = true;
                    break;
                }
            }
            if (!dup) System.out.print(arr[i] + " ");
        }
    }
}
