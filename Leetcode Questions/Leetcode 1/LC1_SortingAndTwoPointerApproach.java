// Not Applicable if the question asks for indexes and not values

import java.util.Arrays;

public class LC1_SortingAndTwoPointerApproach {

    public int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] + nums[right] == target) {
                return new int[] { nums[left], nums[right] };
            }

            else if (nums[left] + nums[right] > target) {
                right--;
            } else {

                left++;
            }
        }

        return new int[] { -1, -1 };
    }

}
