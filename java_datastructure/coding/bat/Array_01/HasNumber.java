package coding.bat.Array_01;

/**
 * Given an int array length 2, return true if it contains a 2 or a 3.

 has23([2, 5]) → true
 has23([4, 3]) → true
 has23([4, 5]) → false
 */
public class HasNumber {
    public boolean has23(int[] nums) {
        boolean result = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 2 || nums[1] == 2) {
                result = true;
            } else if (nums[0] == 3 || nums[1] == 3) {
                result = true;
            } else {
                result = false;
            }
        }
        return result;
    }

    /*Given an int array length 2, return true if it does not contain a 2 or 3.

    no23([4, 5]) → true
    no23([4, 2]) → false
    no23([3, 5]) → false*/
    public boolean no23(int[] nums) {
        boolean result = true;

        if (nums[0] == 2 || nums[1] == 2) {
            result = false;
        } else if (nums[0] == 3 || nums[1] == 3) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }


    /*Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

    double23([2, 2]) → true
    double23([3, 3]) → true
    double23([2, 3]) → false*/

    public boolean double23(int[] nums) {
        boolean result = true;

        if (nums.length == 2) {
            if (nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3) {
                result = true;
            } else {
                return false;
            }
        } else if (nums.length == 1) {
            if (nums[0] == 2 || nums[0] == 3) {
                result = false;
            } else {
                return true;
            }
        } else {
            return false;
        }


        return result;
    }
}

