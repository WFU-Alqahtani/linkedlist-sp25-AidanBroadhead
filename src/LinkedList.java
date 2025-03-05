import java . util .*;
import java.util.Scanner;

class Node{
    int data;
    Node next=null;

    public Node(int i){
        data=i;
    }
    public Node(int i, Node n){
        data=i;
        next=n;
    }
}
public class LinkedList {

    public static void main(String[] args) {
        Random rand = new Random();
        Node head = new Node(rand.nextInt(10));
        Node curr = head;
        for (int i = 0; i < 9; i++) {
            Node temp = new Node(rand.nextInt(10));
            curr.next = temp;
            curr = curr.next;
        }


        //print
        curr = head;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }


        Scanner scnr = new Scanner(System.in);

        // ask user which node they want to delete
        System.out.println("Enter x you want to delete: ");
        int x = scnr.nextInt();

        curr = head.next;
        Node prev = head;

        // while current is not null, check to see if node equals user inputted value, then delete that node
        while (curr != null) {
            if (curr.data == x) {
                prev.next = curr.next;
            }
            prev = prev.next;
            curr = curr.next;
        }

        // insert node at head
        Node temp = head;
        Node newNode = new Node(20, null);
        newNode.next = temp;

        // insert node at end
        curr = newNode;
        while (curr.next != null) {
            curr = curr.next;
        }

        Node endNode = new Node(60, null);
        curr.next = endNode;


        //print list with inserted and deleted nodes
        curr = newNode;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }

    }
}