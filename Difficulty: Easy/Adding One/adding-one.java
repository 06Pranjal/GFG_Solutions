class Solution {
    Vector<Integer> addOne(int[] arr) {
        
        Vector<Integer> res = new Vector<>();
        
        // Copy array
        for (int i = 0; i < arr.length; i++) {
            res.add(arr[i]);
        }

        // Add one from last
        for (int i = res.size() - 1; i >= 0; i--) {
            int sum = res.get(i) + 1;
            res.set(i, sum % 10);

            if (sum < 10) return res; // no carry → done
        }

        // If carry still remains
        res.add(0, 1);
        return res;
    }
}