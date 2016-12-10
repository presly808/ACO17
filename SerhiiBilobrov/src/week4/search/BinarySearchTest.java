package week4.search;

/**
 * Created by serhii on 12/3/16.
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        testIndexOfFirstEl();
        testIndexOfEndEl();
        testIndexOfMidEl();
        testIndexOfNegative();

    }

    private static void testIndexOfNegative() {
        final int[] mas = {1,2,3,4,5,6,7,8};
        int index = BinarySearch.indexOf(mas, 0);
        System.out.printf("testIndexOfNegative %s\n", index == -1);
    }

    private static void testIndexOfEndEl() {
        final int[] mas = {1,2,3,4,5,6,7,8};
        int index = BinarySearch.indexOf(mas, 8);
        System.out.printf("testIndexOfEndEl %s\n", index == 7);

    }

    private static void testIndexOfMidEl() {
        final int[] mas = {1,2,3,4,5,6,7,8,9};
        int index = BinarySearch.indexOf(mas, 5);
        System.out.printf("testIndexOfEndEl %s\n", index == 4);

    }

    private static void testIndexOfFirstEl() {
        final int[] mas = {1,2,3,4,5,6,7,8,9};
        int index = BinarySearch.indexOf(mas, 1);
        System.out.printf("testIndexOfFirstEl %s\n", index == 0);
    }
}
