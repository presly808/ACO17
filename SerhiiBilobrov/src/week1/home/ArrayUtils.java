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

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }

        return sb.toString();
    }

}
