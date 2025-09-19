class Solution {
    public void sortInWave(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i += 2) {
            // If previous element is bigger, swap
            if (arr[i - 1] < arr[i]) {
                swap(arr, i - 1, i);
            }

            // If next element is bigger, swap
            if (i + 1 < n && arr[i + 1] < arr[i]) {
                swap(arr, i + 1, i);
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
