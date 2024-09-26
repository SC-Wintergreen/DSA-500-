public class LC26_TwoPointerApproach {

    public int removeDuplicates(int[] nums) {

        int j = 1, i = 1;

        for (; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[i] = nums[j];
                i++;
            }

        }

        return i;

    }
}