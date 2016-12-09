package models;

public interface Queue {

    void enqueue(Object object);

    Object dequeue();

    Object peek();
}
