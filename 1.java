class 1 {
    public int[] twoSum(int[] nums, int target) {

        // Check every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                // If the sum matches target
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // return the indices
                }
            }
        }

        return new int[]{-1, -1}; // not needed because question guarantees one answer
    }
}
