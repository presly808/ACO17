public class TestLinkedQueue {

    public static void main(String[] args) {

        System.out.println("testEnqueue() --> " + testEnqueue() +
                           "\ntestDequeue() --> " + testDequeue() +
                           "\ntestPeek() --> " + testPeek() +
                           "\ntestSearch() --> " + testSearch() +
                           "\ntestSwapLast() --> " + testSwap());
    }

    private static boolean testEnqueue() {

        LinkedQueue queue = new LinkedQueue();

        for (int i = 0; i < 100; i++) {
            queue.enqueue("val" + i);
        }

        boolean res1 = queue.getHead().val.equals("val0");
        boolean res2 = queue.getTail().val.equals("val99");

        return res1 && res2;
    }

    private static boolean testDequeue() {

        LinkedQueue queue = new LinkedQueue();

        for (int i = 0; i < 100; i++) {
            queue.enqueue("val" + i);
        }

        String dequeue = queue.dequeue().toString();

        boolean res1 = queue.getHead().val.equals("val1");
        boolean res2 = dequeue.equals("val0");

        return res1 && res2;
    }

    private static boolean testPeek() {

        LinkedQueue queue = new LinkedQueue();

        for (int i = 0; i < 100; i++) {
            queue.enqueue("val" + i);
        }

        Object peek = queue.peek();

        boolean res1 = peek.equals("val99");
        boolean res2 = queue.getTail().val.equals("val99");

        return res1 && res2;
    }

    private static boolean testSearch() {

        LinkedQueue queue = new LinkedQueue();

        for (int i = 0; i < 100; i++) {
            queue.enqueue("val" + i);
        }

        boolean res1 = queue.search("val34").val.toString().equals("val34");
        boolean res2 = queue.search("val99").val.toString().equals("val99");
        boolean res3 = queue.search("val1000") == null;

        return res1 && res2 && res3;
    }

    private static boolean testSwap() {

        LinkedQueue queue = new LinkedQueue();

        for (int i = 0; i < 100; i++) {
            queue.enqueue("val" + i);
        }

        queue.swapLast();

        boolean res1 = queue.getHead().val.equals("val99");
        boolean res2 = queue.getTail().val.equals("val0");

        return res1 && res2;
    }
}
