package coding.bat.Array_01;

/**
 * Given an array of ints length 3, return the sum of all the elements.
 */
public class Sum {
    public int sum3(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++)
        {
            result +=nums[i];
        }
        return result;
    }
    public int sum2(int[] nums) {
        int temp =0;
        if(nums.length==0|| nums == null)
        {
            temp = 0 ;
        }
        else if(nums.length<2){
            temp =nums[0];
        }
        else{
            temp = nums[0] + nums[1];
        }
        return temp;

    }


}
