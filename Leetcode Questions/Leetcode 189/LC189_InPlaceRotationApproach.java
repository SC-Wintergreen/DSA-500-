public class LC189_InPlaceRotationApproach {

    public void swapNums(int[] nums, int i, int j) {

        int swap = nums[i];
        nums[i] = nums[j];
        nums[j] = swap;
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swapNums(nums, start, end);
            start++;
            end--;
        }
    }

    public void rotate(int[] nums, int k) {

        int size = nums.length;
        k = k % size;
        int pivot = size - k;
        int lastInd = size - 1;

        reverse(nums, 0, pivot - 1);
        reverse(nums, pivot, lastInd);
        reverse(nums, 0, lastInd);

    }
}