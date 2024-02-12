public class BiggestNumber {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 25, 15}; // Example array

        int biggestNumber = findBiggestNumber(array);

        System.out.println("The biggest number in the array is: " + biggestNumber);
    }

    public static int findBiggestNumber(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null.");
        }

        int biggest = arr[0]; // Assume first element as the biggest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }

        return biggest;
    }
}



