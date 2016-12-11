package by_video.statics;

import by_video.common.MyIterator;
import by_video.common.MyStack;

public class MyArrayStack implements MyStack{

    private Object[] mas;
    private int lastObj;

    public MyArrayStack(int sizeOfMas) {
        this.mas = new Object[sizeOfMas];
    }

    @Override
    public void push(Object object) {

        if (mas.length == lastObj) {
            System.err.println("Exception in thread \"main\" java.lang.StackOverflowException");
            return;
        }

        mas[lastObj++] = object;
    }

    @Override
    public Object pop() {

        lastObj--;

        if (this.mas[lastObj] != null) {

            Object res = this.mas[lastObj];
            this.mas[lastObj] = null;
            return res;
        }

        lastObj++;

        return null;
    }

    @Override
    public MyIterator iterator() {
        return new MyArrayStackIterator(mas, lastObj - 1);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("[ ");

        for (int i = 0; i < lastObj; i++) {
            sb.append(this.mas[i]).append(" ");
        }

        sb.append("]");

        return "MyArrayStack{" +
                "mas=" + sb.toString() +
                '}';
    }

    private static class MyArrayStackIterator implements MyIterator{

        private Object[] mas;
        private int curr;

        public MyArrayStackIterator(Object[] mas, int top) {
            this.mas = mas;
            curr = top;
        }

        @Override
        public Object next() {

            Object last = mas[curr];
            curr--;
            return last;
        }

        @Override
        public boolean hasNext() {

            return curr >= 0;
        }
    }
}
