package coding.bat.Array_01;

/**
 * Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
 * and set all the other elements to be that value. Return the changed array.

 maxEnd3([1, 2, 3]) → [3, 3, 3]
 maxEnd3([11, 5, 9]) → [11, 11, 11]
 maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class MaxEnd {
    public int[] maxEnd3(int[] nums){
        int first =0;
        int last = 0;
        if(nums[0]>nums[nums.length-1]){
            first = nums[0];
            for(int i=0;i<nums.length;i++){
                nums[i]=first;
            }
        }
        else{
            last = nums[nums.length-1];
            for(int i=0;i<nums.length;i++){
                nums[i]=last;
            }
        }
        return nums;
    }
}
