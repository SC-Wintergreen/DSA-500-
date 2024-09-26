// Problem Link - https://www.naukri.com/code360/problems/pair-sum_697295

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairSum_BruteForceApproach {

    public static List<int[]> pairSum(int[] arr, int s) {
        // Write your code here.

        List<int[]> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == s) {
                    result.add(new int[] { arr[i], arr[j] });
                }
            }
        }

        return result;
    }
}