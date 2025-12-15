public class 4{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;

        int[] arr = new int[m + n];

        // copy nums1
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }

        // copy nums2
        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }

        // sort merged array
        Arrays.sort(arr);

        int len = arr.length;

        // if odd length
        if (len % 2 != 0) {
            return arr[len / 2];
        }
        // if even length
        else {
            return (arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        }
    }
}
 4 {
    
}
