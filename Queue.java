class Queue {
    int front, rear, size, capacity;
    int[] arr;

    Queue(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = capacity - 1;
        arr = new int[capacity];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int item) {
        if (isFull())
            return;
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    int dequeue() {
        if (isEmpty())
            return -1;
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    int front() {
        if (isEmpty())
            return -1;
        return arr[front];
    }

    int rear() {
        if (isEmpty())
            return -1;
        return arr[rear];
    }
}

public class Main {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.rear());
    }
}