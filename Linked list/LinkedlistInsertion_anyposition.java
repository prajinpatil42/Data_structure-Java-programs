import java.util.Scanner;

public class LinkedlistInsertion_anyposition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }

    }

    Node head = null;

    public void creation() {

        int data, n, p, m;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter Data:");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;

            } else {
                System.out.println(
                        "Enter 1 to insert the item at beginning, 2 to insert intem at end ,Enter 3 to insert item at any position");
                m = sc.nextInt();
                switch (m) {

                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;

                        while (temp.next != null) {

                            temp = temp.next;

                        }
                        temp.next = new_node;

                        break;

                    case 3:
                        System.out.println("enter position of node to be inserted:");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;

                        }

                        new_node.next = temp1.next;
                        temp1.next = new_node;

                        break;

                }
            }

            System.out.println("Do u eant to add more data.if yes, press 1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void delete() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);

        do {
            if (head == null) {
                System.out.println("LL is Empty");
            } else {
                System.out.println(
                        "Enter 1 for delete from beginning,2 to delete the item from the end, 3 to delete item from any position");

                m = sc.nextInt();

                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;

                        head = temp;

                        break;

                    case 2:

                        Node temp1 = head;
                        Node ptr = temp1.next;

                        while (ptr.next != null) {

                            temp1 = ptr;
                            ptr = ptr.next;

                        }
                        temp1.next = null;

                        break;

                    case 3:

                        System.out.println("Enter position of node  to be deleted");
                        p = sc.nextInt();

                        Node temp2 = head;
                        Node ptr1 = temp2.next;

                        for (int i = 0; i < p - 2; i++) {

                            temp2 = ptr1;
                            ptr1 = ptr1.next;

                        }
                        temp2.next = ptr1.next;

                        break;
                }
            }

            System.out.println("Do u eant to delete more data.if yes, press 1");
            n = sc.nextInt();
        } while (n == 1);
    }

    public void traverser() {
        Node temp = head;

        if (head == null) {
            System.out.println("Linked list does not exist");
        } else {

            while (temp != null) {

                System.out.print(temp.data + " ");
                temp = temp.next;

            }
        }
    }

    public static void main(String[] args) {
        LinkedlistInsertion_anyposition obj = new LinkedlistInsertion_anyposition();
        obj.creation();
        obj.delete();
        obj.traverser();

    }
}
