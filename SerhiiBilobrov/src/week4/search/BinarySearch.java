package week4.search;

/**
 * Created by serhii on 12/3/16.
 */
public class BinarySearch {


    /**
     *
     * @param mas sorted array
     *
     * @return index of found element,
     *  otherwise return -1 if element was not found
     * */
    public static int indexOf(int[] mas, int key){

        if(mas == null || mas.length == 0){
            return -1;
        }

        int start = 0;
        int end = mas.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if(mas[mid] == key){
                return mid;
            } else if(key < mas[mid]){
                end = mid - 1;
            } else if(key > mas[mid]){
                start = mid + 1;
            }
        }

        return -1;
    }


}
