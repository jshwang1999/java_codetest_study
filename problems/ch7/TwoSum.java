package problems.ch7;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 6, 11, 15};
        int target = 8;

        TwoSum twoSumInstance = new TwoSum();
        int[] result = twoSumInstance.twoSum(nums, target);

        if (result != null) {
            System.out.println("결과: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("해가 없습니다.");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(target - nums[i])) {
                return new int[]{numsMap.get(target - nums[i]), i};
            }
            numsMap.put(nums[i], i);
        }
        return null;
    }
}
