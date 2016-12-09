package models;

import org.jetbrains.annotations.NotNull;

public class Node implements Comparable{

    public Object val;
    public Node next;

    public Node(Node next) {
        this.next = next;
    }

    public Node(Object val, Node next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (val != null ? !val.equals(node.val) : node.val != null) return false;
        return next != null ? next.equals(node.next) : node.next == null;

    }

    @Override
    public int hashCode() {
        int result = val != null ? val.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(@NotNull Object o) {
        return this.val.hashCode() - o.hashCode();
    }
}
