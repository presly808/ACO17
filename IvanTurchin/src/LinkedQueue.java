import models.Node;
import models.Queue;

import org.jetbrains.annotations.NotNull;

import java.util.EmptyStackException;

public class LinkedQueue implements Queue {

    private Node head = null;
    private Node tail = null;

    @Override
    public void enqueue(@NotNull Object object) {

        if (head == null) {
            head = new Node(object, null);
        } else if (tail == null) {
            tail = new Node(object, null);
            head.next = tail;
        } else {
            tail.next = new Node(object, null);
            tail = tail.next;
        }
    }

    @Override
    public Object dequeue() {
        if (this.head == null) {
            throw new EmptyStackException();
        }

        Object res = head.val;
        head = head.next;
        return res;
    }

    @Override
    public Object peek() {

        if (tail != null) {
            return tail.val;
        } else if (head != null) {
            return head.val;
        }

        throw new EmptyStackException();
    }

    public Node search(@NotNull Object key) {
        Node copy = head;
        return searchR(copy, key);
    }

    private Node searchR(Node head, Object val) {

        if (head.val.equals(val)) {
            return head;
        }

        if (head.next == null) {
            return null;
        }

        return searchR(head.next, val);
    }

    public void swapLast() {

        if (head == null || tail == null) {
            return;
        }

        Object val = head.val;
        head.val = tail.val;
        tail.val = val;
    }

    // this getters needed just for tests
    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
