public class sorting01 {
    public static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] arr = {1, 0, 0, 1, 1, 0, 1};

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            // Move low forward if it's already 0
            while (arr[low] == 0 && low < high) {
                low++;
            }

            // Move high backward if it's already 1
            while (arr[high] == 1 && low < high) {
                high--;
            }

            // Now arr[low] == 1 and arr[high] == 0, so swap
            if (low < high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }

        printArr(arr);
    }
}
