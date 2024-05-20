package gr.aueb.cf.ch6;

/**
 * Demo of FIFO queues.
 */
public class QueueApp {
    static int[] queue = new int[100];
    static int pivot = -1;

    public static void main(String[] args) {

    }

    public static void enQueue(int num){
        if (isFull()){
            System.out.println("Queue is Full");
            return;
        }
        queue[++pivot] = num;
    }

    public static int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return 0;
        }
        
        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valueToReturn;
    }

    public static void shiftQueueLeft(){
        for (int i = 0; i <= pivot; i++) {
            queue[i] = queue[i + 1];
        }
    }

    public static boolean isEmpty(){
        return pivot == -1;
    }

    public static boolean isFull() {
        return pivot == queue.length - 1;
    }
}
