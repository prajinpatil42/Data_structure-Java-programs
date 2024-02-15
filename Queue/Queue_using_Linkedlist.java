import java.util.*;


class Queue1{



    static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next =null;
    }}
    Node f=null;
    Node r=null;

    public void enqueue(Scanner sc)
    {

        System.out.println("Enter Data");
        int data =sc.nextInt();
        Node new_node=new Node(data);

        if (f == null) {
            f=new_node;
            r=new_node;
            
        }else{

            r.next=new_node;
            r=new_node;

        }

    }


    public void dequeue()
    {
        if (f == null) {
            System.out.println("Underflow");
        }else{
            f=f.next;

        }

        
    }

    public void display()
    {
        Node temp=f;

        while (temp!= null) {

            System.out.print(temp.data+" ");
            temp=temp.next;

            
        }
        System.out.println();
    }
}













public class Queue_using_Linkedlist{
    
    public static void main(String[] args) {
        int d,l;

        Scanner sc=new Scanner(System.in);
        Queue1 obj=new Queue1();
        do{
            System.out.println("Press 1 to enqueue");
            System.out.println("Press 2 to dequeue");
            System.out.println("Press 3 to display");
            System.out.println("Enter your choice");

            d=sc.nextInt();
            switch (d){
                case 1:
                    obj.enqueue(sc);
                    break;
            
                    case 2:
                    obj.dequeue();
                    
                    break;

                    case 3:
                    obj.display();
                    break;
            }
            System.out.println("Enter 0 to go back to the main menu");
            System.out.println("ENTER ANY KEY TO EXIT");
            l=sc.nextInt();


        }while(l == 0);

        System.out.println("EXIT SUCESSFULLY...");

    }
}