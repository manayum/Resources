package coding.bat.Array_01;

/**
 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

 middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
 middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
 middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
public class MiddleWay {

    public int[] middleWay(int[] a, int[] b) {
        int [] myArray = new int [a.length-1];

        for(int i=1;i<myArray.length;i++){
            myArray[0] = a[i];
            myArray[1] = b[i];
        }
        return myArray;
    }

}
