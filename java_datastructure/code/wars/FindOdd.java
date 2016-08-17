package code.wars;

/**
 * Created by Admin on 8/14/2016.
 */
public class FindOdd {

    public int find(int[] A) {
        int odd=0;
        int x=0;
        for(int i=0;i<A.length;i++){
            x=0;
            for(int j=0;j<A.length;j++){
                if(A[i] == A[j]){
                    x++;
                }
            }
            if(x%2==1){
                odd = A[i];
            }
        }
        return odd;
    }
}
