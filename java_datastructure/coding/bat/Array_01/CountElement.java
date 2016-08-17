package coding.bat.Array_01;

/**
 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

 start1([1, 2, 3], [1, 3]) → 2
 start1([7, 2, 3], [1]) → 1
 start1([1, 2], []) → 1
 */
public class CountElement {

    public int start1(int[] a, int[] b) {
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                count = count +1;
            }
        }
        for(int j=0;j<b.length;j++){
            if(b[j]==1)            {
                count = count +1;
            }
        }
        return count;
    }

    /*Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
     Return the array which has the largest sum. In event of a tie, return a.
    biggerTwo([1, 2], [3, 4]) → [3, 4]
    biggerTwo([3, 4], [1, 2]) → [3, 4]
    biggerTwo([1, 1], [1, 2]) → [1, 2]*/

    public int[] biggerTwo(int[] a, int[] b) {

        int [] myArray = new int[a.length];
        int aSum = 0;
        int bSum = 0;

        for(int i=0;i<a.length;i++){
            aSum = aSum + a[i];
        }
        for(int j=0;j<b.length;j++){
            bSum = bSum + b[j];
        }
        for(int k=0;k<myArray.length;k++){
            if(aSum > bSum || aSum == bSum){
                myArray[k]= a[k];
            }
            else{
                myArray[k] = b[k];
            }
        }
        return myArray;

    }




}
