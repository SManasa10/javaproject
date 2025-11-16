public class SecondLargestMethod {

    
    public static int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;  
                largest = n;        
            } 
            else if (n > second && n != largest) {
                second = n;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 5, 30, 18};

        int result = getSecondLargest(numbers);
        System.out.println("Second largest number = " + result);
    }
}
