class Solution {
    public int jump(int[] a) {
        int j = 0;
        int end = 0;
        int far = 0;
        for (int i = 0; i < a.length - 1; i++) {
            far = Math.max(far, i + a[i]);
            if (i == end) {
                j++;
                end = far;
            }
        }
        return j;
    }
}