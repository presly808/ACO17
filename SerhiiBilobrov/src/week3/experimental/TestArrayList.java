package week3.experimental;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by serhii on 11/27/16.
 */
public class TestArrayList {

    public static void main(String[] args) {
        String[] arr = new String[10];
        arr[0] = "sdfsd";
        String str = arr[0];

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("sdfsd");
        arrayList.add(0,"first");
        String el = arrayList.get(0);
        int size = arrayList.size();

        arrayList.add(7, "");

        Object[] obj = arrayList.toArray();
        String[] arrStr = arrayList.toArray(new String[size]);
        System.out.println(Arrays.toString(obj));
    }
}
