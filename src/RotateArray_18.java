
public class RotateArray_18 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int point = k % n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, point - 1);
        reverse(nums, point, n - 1);
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
