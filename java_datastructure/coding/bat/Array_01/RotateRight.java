package coding.bat.Array_01;

/**
 * Created by Admin on 8/14/2016.
 */
public class RotateRight {

    public int[] rotateNow(int nums[],int data) {
        int x = data - 1;
        int y = 0;
        int arr[] = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (x >= 0) {
                arr[x] = nums[i];
                x = x - 1;
            }
        }
        for (int j = data; j <= nums.length - 1; j++) {
            arr[j] = nums[y];
            y = y + 1;
        }

        for (int w = 0; w < arr.length; w++) {
            System.out.print(arr[w] + "\t");
        }
        return arr;
    }

}