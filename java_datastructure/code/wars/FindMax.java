package code.wars;

/**
 * Created by Admin on 8/16/2016.
 */
public class FindMax {

    public int Max(int[] nums) {
        // int myArr[] = new int[nums.length];
        int max = 0;
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[j]) {
                max = nums[i];
                j = j + 1;
            } else {
                max = nums[j];
            }
        }
        return max;
    }

}
