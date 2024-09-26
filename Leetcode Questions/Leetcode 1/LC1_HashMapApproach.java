
import java.util.HashMap;
import java.util.Map;

public class LC1_HashMapApproach {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> indMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (indMap.containsKey(target - nums[i])) {

                return new int[] { i, indMap.get(target - nums[i]) };
            }

            indMap.put(nums[i], i);
        }

        return new int[] { -1, -1 };

    }

}

// TC - O(n) and SC - O(n)