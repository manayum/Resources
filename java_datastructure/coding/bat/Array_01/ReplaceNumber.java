package coding.bat.Array_01;

/**
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

 fix23([1, 2, 3]) → [1, 2, 0]
 fix23([2, 3, 5]) → [2, 0, 5]
 fix23([1, 2, 1]) → [1, 2, 1]
 */
public class ReplaceNumber {
    public int[] replace(int[] nums) {
        int [] myArray = new int [nums.length];
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==2 && nums[j]==3){
                nums[j]=0;
            }
            j++;
        }
        for(int k=0;k<nums.length; k++){
            System.out.println(nums[k]);
        }

    return nums;
    }

}
