class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] p = {-1, -1};
        p[0] = first(nums, target);
        p[1] = last(nums, target);
        return p;
    }
    int first(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int a = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (nums[m] == target) {
                a = m;
                h = m - 1; 
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return a;
    }
    int last(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int a = -1;
        while (l <= h) {
            int m = l + (h - l) / 2;

            if (nums[m] == target) {
                a = m;
                l = m + 1;   
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return a;
    }
}