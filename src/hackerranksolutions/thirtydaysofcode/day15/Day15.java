package hackerranksolutions.thirtydaysofcode.day15;

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your            class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();

        LinkedList newList = new LinkedList();
        newList.head = new LinkedList.Node(input.nextInt());

        for(int i = 0; i < count - 1; i++) {
            int newData = input.nextInt();
            new LinkedList.Node(newData).insert(newList.head, newData);
        }

        newList.printList();
    }
}


class LinkedList {
    Node head;

    public void printList() {
        Node n = head;

        while(n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int newData) {
            data = newData;
            next = null;
        }

        public void insert(Node head, int data) {
            if(head == null) {
                new Node(data);
            } else if(head.next == null){
                head.next = new Node(data);
            } else{
                insert(head.next, data);
            }

        }
    }
}
