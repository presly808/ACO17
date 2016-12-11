package by_video.java8;

public class TestDefault implements someI{

}

interface someI {

    default void function() {
        System.out.println("some interface's default method");
    }
}
