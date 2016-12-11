package by_video.data_structure.dynamic;

import by_video.common.MyIterator;
import by_video.common.MyStack;
import by_video.data_structure.test.TestNode;

public class MyLinkedStack implements MyStack {

    private Node top;

    @Override
    public void push(Object object) {

        if (top == null) {
            top = new Node(object, null);
        } else {
            top = new Node(object, top);
        }
    }

    @Override
    public Object pop() {

        if (top == null) {
            return null;
        }

        Object res = top.val;
        top = top.next;
        return res;
    }

    @Override
    public MyIterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedStack{" +
                "top=" + TestNode.toString(top) +
                '}';
    }
}
