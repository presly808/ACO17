package by_video.tests;

import by_video.common.MyIterator;
import by_video.common.MyStack;
import by_video.statics.MyArrayStack;

public class TestIterator {

    public static void main(String[] args) {

        MyStack stack = new MyArrayStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        MyIterator iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
