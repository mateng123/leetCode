public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int p = m + n;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[--p] = nums1[--m];
            } else {
                nums1[--p] = nums2[--n];
            }


        }
        while (m == 0) {
            nums1[--p] = nums2[--n];
            if (n == 0) break;
        }
    }
}
