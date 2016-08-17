package coding.bat.Array_01;

/**
 * Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.

 makeEnds([1, 2, 3]) → [1, 3]
 makeEnds([1, 2, 3, 4]) → [1, 4]
 makeEnds([7, 4, 6, 2]) → [7, 2]
 */
public class MakeEnd {
    public int[] makeEnds(int[] nums) {
        int [] myArray = new int [2];

        myArray[0] = nums[0];
        myArray[1]  = nums[nums.length-1];
        return myArray;
    }



    /*Given an int array, return a new array with double the length where its last element is the same as the original array,
     and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
    makeLast([1, 2]) → [0, 0, 0, 2]
    makeLast([3]) → [0, 3]
*/


    public int[] makeLast(int[] nums) {

        int [] myArray = new int[nums.length*2];

        for(int i=0;i<myArray.length;i++){
            myArray[i] = 0;
            if(i == myArray.length-1){
                myArray[myArray.length-1] = nums[nums.length-1];
            }
        }
        return myArray;
    }

}
