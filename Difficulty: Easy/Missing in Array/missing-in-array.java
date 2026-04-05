class Solution {

    int missingNum(int arr[]) {
        int n = arr.length + 1;

        int xor1 = 0; // XOR from 1 to n
        int xor2 = 0; // XOR of array

        // XOR of numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xor1 = xor1 ^ i;
        }

        // XOR of array elements
        for (int i = 0; i < arr.length; i++) {
            xor2 = xor2 ^ arr[i];
        }

        // Missing number
        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();

        int result = ob.missingNum(new int[]{8, 2, 4, 5, 3, 7, 1});
        System.out.println(result);
    }
}