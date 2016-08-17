package coding.bat.Array_01;

/**
 * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
 */
public class MakePI {

    public int[] makePi() {
        int arr[]={3,1,4};
        for(int i=0; i<arr.length-1; i++){
            arr[i]=arr[i];
        }
        return arr;
    }

}
