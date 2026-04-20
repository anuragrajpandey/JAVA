import java.util.*;

class Node {
    int info;
    Node next;

    Node(int data) {
        info = data;
        next = null;
    }
}

class LinkedList {
    Scanner sc = new Scanner(System.in);
    Node head;

    LinkedList() {
        head = null;
    }

    void addNodeAtBeginning() {
        System.out.print("\nEnter data: ");
        int data = sc.nextInt();

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }

        System.out.println("Node added at beginning: " + data);
    }

    void addNodeAtEnd() {
        System.out.print("\nEnter data: ");
        int data = sc.nextInt();

        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }

        System.out.println("Node added at end: " + data);
    }

    void traverse() {
        Node temp = head;

        if (temp == null) {
            System.out.println("\nList is empty.");
            return;
        }

        System.out.println("\nList is:");
        while (temp != null) {
            System.out.println(temp.info);
            temp = temp.next;
        }
    }

    void menu() {
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n******* Linked List ******");
            System.out.println("0. Exit");
            System.out.println("1. Add node at beginning");
            System.out.println("2. Add node at end");
            System.out.println("3. Traverse");
            System.out.println("**************************");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Good bye");
                    break;

                case 1:
                    addNodeAtBeginning();
                    break;

                case 2:
                    addNodeAtEnd();
                    break;

                case 3:
                    traverse();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

public class LinkedList {
    public static void main(String[] args) {
        LinkedList mylist = new LinkedList();
        mylist.menu();
    }
}
