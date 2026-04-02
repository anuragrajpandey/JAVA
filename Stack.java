class Stack {
    int top;
    int capacity;
    int[] arr;

    Stack(int capacity) {
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int item) {
        if (isFull())
            return;
        arr[++top] = item;
    }

    int pop() {
        if (isEmpty())
            return -1;
        return arr[top--];
    }

    int peek() {
        if (isEmpty())
            return -1;
        return arr[top];
    }
}

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}