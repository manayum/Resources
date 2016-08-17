package code.wars;

/**
 * Given an array of ints length 3, figure out which is larger between the first
 * and last elements in the array, and set all the other elements to be that value.
 * Return the changed array.
 */
public class FindBiggest {

    public int betweenNumber (int[] nums) {
        int max = Math.max(nums[0], nums[4]);
        return max;
    }
}
