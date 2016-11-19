package week1.home;

/**
 * Created by Maria on 19.11.2016.
 */
public class ArrayUtils {

    // my comment
    public static String asString(int[] arr){
        if(arr == null || arr.length == 0){
            return "[]";
        }

        String res = "";

        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + " ";
        }

        return res;
    }

}
