package week3.experimental;

import java.util.Arrays;

public class TestArraysOperations {

    public static void main(String[] args) {
        int[] mas = {2,1,-5,56,23,12,44,3};
        int[] copy = Arrays.copyOf(mas, 3);

        String strRepresentation = Arrays.toString(copy);

        int[] rangeCopy = Arrays.copyOfRange(mas, 1, 4); //

        System.out.println(Arrays.toString(rangeCopy));

        boolean result = Arrays.equals(mas, copy);

        Arrays.sort(mas);

        System.out.println(Arrays.toString(mas));

        Arrays.fill(rangeCopy, 0, 2, 23);

        Arrays.fill(rangeCopy, 23);


        int[] a = {1,2,3,4,5,6};
        int[] b = {0,0,0,0,0,0,0};

        System.arraycopy(a,3,b,0,3);

        System.out.println(Arrays.toString(b));


        int[] d = {1,2,3,4,0,6,7,8};
        System.arraycopy(d, 5, d, 4, 3);
        System.out.println(Arrays.toString(d));

        int[] trimmed = Arrays.copyOf(d, d.length - 1);

        System.out.println(Arrays.toString(trimmed));


        System.out.println(Arrays.toString(Arrays.copyOf(d, 20)));

    }

}
