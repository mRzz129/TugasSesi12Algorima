public class LinearSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return index jika ditemukan
            }
        }
        return -1; // Return -1 jika tidak ditemukan
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 2, 10, 1, 6, 3};
        int key = 10;

        // Menghitung waktu eksekusi
        long startTime = System.nanoTime();
        int resultIndex = linearSearch(array, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        if (resultIndex != -1) {
            System.out.println("Element " + key + " found at index " + resultIndex);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }
}