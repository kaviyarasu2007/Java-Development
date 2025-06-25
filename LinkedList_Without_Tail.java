import java.util.*;

public class LinkedList_Head {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        LinkedList_Head list = new LinkedList_Head();

        
        Node n1 = list.new Node(10);
        Node n2 = list.new Node(20);
        
        
        n1.next = n2;
        
        
        Node head = n1;
        
        
        System.out.println("Original list:");
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();

        
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        
        System.out.println("Enter the Element for end:");
        Node newNode = list.new Node(user.nextInt());
        last.next = newNode;

        
        System.out.println("\nAfter adding new node at end:");
        temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
        
       
        System.out.println("Enter the position :");
        int pos = user.nextInt();
        System.out.println("Enter the element:");
        Node posNode = list.new Node(user.nextInt());
        
        if (pos == 1) {
            posNode.next = head;
            head = posNode;
        } else {
            Node prev = head;
            for (int i = 1; i < pos - 1 && prev != null; i++) {
                prev = prev.next;
            }
            if (prev != null) {
                posNode.next = prev.next;
                prev.next = posNode;
            } else {
                System.out.println("Invalid position");
            }
        }

        
        System.out.println("After adding element at position " + pos + ":");
        temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
