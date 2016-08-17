package coding.bat.com.testclass;

/**
 * Created by Admin on 8/14/2016.
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {5, 110, 1300, 14, 150};

        /********************************Problem No 1:*******************************************
         RotateLeft rotateL = new RotateLeft();
         System.out.println("\nRotate Left:");
         rotateL.rotateNow(nums);
         *****************************************************************************************/

        /*******************************Problem No 2:********************************************
         RotateLeft rotateL = new RotateLeft();
         System.out.println("\nRotate Left:");
         rotateL.rotateBy(nums, 5);
         ****************************************************************************************/

        /*********************************Problem No 3: *****************************************
         RotateRight rotateR = new RotateRight();
         System.out.println("Rotate Right:");
         rotateR.rotateNow(nums,5);
         *****************************************************************************************/

        /*********************************Problem No 4:******************************************
         Given an array, find the int that appears an odd number of times.
         There will always be only one integer that appears an odd number of times.

         FindOdd  odd = new FindOdd();
         System.out.println(odd.find(nums));
         ****************************************************************************************/

        /********************************Problem No 5:*******************************************
         Find the Maximum Number;
         FindMax findMax = new FindMax();
         System.out.println(findMax.Max(nums));
         *****************************************************************************************/

        /********************************Problem No 6:*******************************************
        FindBiggest findBiggest = new FindBiggest();
        System.out.println(findBiggest.betweenNumber(nums));
        ******************************************************************************************/

        /********************************Problem No 6:*******************************************
        int [] num={2};
        HasNumber hasNumber = new HasNumber();
        hasNumber.double23(num);
        ******************************************************************************************/

        /********************************Problem No 6:*******************************************
        ReplaceNumber replaceNumber = new ReplaceNumber();
        int [] num = {1,0,2,1,2,3,4,5,2,3};
        replaceNumber.replace(num);
         ******************************************************************************************/


    }

}

















    /**
        import org.junit.Test;
        import static org.junit.Assert.assertEquals;

        public class FindOddTest {

            @Test
            public void findTest() {
                assertEquals(5, FindOdd.findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
                assertEquals(-1, FindOdd.findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
                assertEquals(5, FindOdd.findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
                assertEquals(10, FindOdd.findIt(new int[]{10}));
                assertEquals(10, FindOdd.findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
                assertEquals(1, FindOdd.findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
            }
        }

     */


