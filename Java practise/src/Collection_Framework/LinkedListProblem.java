package Collection_Framework;
import java.util.Scanner;

class SinglyLinkedList {
    private Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void add(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" ");
            }
            current = current.next;
        }
        System.out.println();    }
}

// Non editable starts here
public class LinkedListProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        if (numberOfElements > 0) {
            SinglyLinkedList.Node head = new SinglyLinkedList.Node(scanner.nextInt());
            SinglyLinkedList linkedList = new SinglyLinkedList(head);
            for (int i = 1; i < numberOfElements; i++) {
                linkedList.add(new SinglyLinkedList.Node(scanner.nextInt()));
            }
            linkedList.reverse();
            linkedList.print();
        }
        scanner.close();
    }
}
// Non editable ends here