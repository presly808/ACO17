package by_video.java8;

import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreams {

    public static void main(String[] args) {

        testStream();
        testLambda();
        testFlatTable();
        testJoinCollector();
        testFunctionReference();
    }

    public static void testStream() {

        List<Integer> nums = Arrays.asList(5, 3, 8, 9, 1, 4, 2, 6, 7, 0);

        Function<Integer, Integer> sumF = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 4;
            }
        };

        Function<Integer, Integer> multF = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 3;
            }
        };

        Predicate<Integer> predicateEvens = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        };

        BinaryOperator<Integer> reduceSum = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        Integer res = nums.stream().map(sumF).map(multF).filter(predicateEvens).reduce(reduceSum).get();

        System.out.println(res);
    }

    public static void testLambda() {
        List<Integer> nums = Arrays.asList(5, 3, 8, 9, 1, 4, 2, 6, 7, 0);

        Integer res = nums.stream().map((a) -> a + 4).map((a) -> a * 3).
                filter((a) -> a % 2 == 0).reduce((a, b) -> a + b).get();

        System.out.println(res);
    }

    public static void testFlatTable() {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        nums.stream().flatMap((integer) -> Stream.of(integer, integer + 1)).
                forEach(System.out::print);

        System.out.println();
    }

    public static void testJoinCollector() {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        String res = nums.stream().flatMap((integer) -> Stream.of(integer, integer * 2)).map(Object::toString).
                collect(Collectors.joining(", "));

        System.out.println(res);
    }

    public static void testFunctionReference() {

        String res = Stream.generate(Math::random).limit(3).map(Object::toString).
                collect(Collectors.joining(", "));

        System.out.println(res);
    }
}
