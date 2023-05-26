public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        long startTime = System.nanoTime();
        int index = binarySearch(arr, target);
        long endTime = System.nanoTime();

        if (index != -1) {
            System.out.println("Elemen ditemukan pada indeks " + index);
        } else {
            System.out.println("Elemen tidak ditemukan dalam array.");
        }

        long duration = endTime - startTime;
        System.out.println("Waktu eksekusi: " + duration + " nanosekon");
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Elemen tidak ditemukan
    }
}