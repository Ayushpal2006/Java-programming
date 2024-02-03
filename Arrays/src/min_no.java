import javax.naming.PartialResultException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class min_no {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int p=arr.length;
        System.out.println(min(arr));
    }

    static int min(int arr[]){
        int Min=0;
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]<Min){
                Min=arr[i];
            }
        }
    return Min;
    }
}