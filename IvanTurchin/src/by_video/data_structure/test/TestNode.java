package by_video.data_structure.test;

import by_video.data_structure.dynamic.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestNode {

    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        System.out.println(a);
    }

    public static Node addToTail(Node node, Node val) {

        if (node.next == null) {
            node.next = val;
            return node;
        }

        return addToTail(node.next, val);
    }

    public static Node addToHead(Node head, Node val) {

        if (val.next == null) {
            val.next = head;
            return val;
        }

        return addToTail(head, val.next);
    }

    public static String toString(Node node) {

        StringBuilder sb = new StringBuilder();

        return node.next == null ? sb.append(node.val).toString() :
                sb.append(node.val).append(" ").append(toString(node.next)).toString();
    }

    private static Node createChain(int size) {
        Node head = new Node(0, null);
        Node last = head;

        for (int i = 1; i < size; i++) {
            last.next = new Node(i, null);
            last = last.next;
        }

        return head;
    }

    private static void test4() {
        Node head = new Node(1, null);
        Node last = head;

        for (int i = 0; i < 10; i++) {
            last = new Node(i, last);
        }
    }

    private static void test3() {
        Node head = new Node(1, null);

        for (int i = 0; i < 10; i++) {
            head = new Node(i, head);
        }
    }

    private static void test2() {
        Node head = new Node(1, null);

        Node second = new Node(2, head);
        Node third = new Node(3, second);
    }
}
