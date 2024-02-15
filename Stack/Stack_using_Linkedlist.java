import java.util.*;

 class Stack1 {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next =null;
        }}
        Node top=null;
    

    void push(Scanner sc)
    {
        System.out.println("Enter data:");
        int data=sc.nextInt();
        Node new_node =new Node(data);
        if(top == null)
        {
            top=new_node;
        }
        else
        {
            new_node.next = top;
            top = new_node;
        }

    }

    void pop()
    {
        if(top == null)
        {
            System.out.println("STack is empty");
        }else{
            top=top.next;
        }

    }

    void display(){

        Node temp = top;

        while (temp!= null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

    }
    
    
}


public class Stack_using_Linkedlist{
    
    public static void main(String[] args) {
        int d,l;

        Scanner sc=new Scanner(System.in);
        Stack1 obj=new Stack1();
        do{
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to display");
            System.out.println("Enter your choice");

            d=sc.nextInt();
            switch (d){
                case 1:
                    obj.push(sc);
                    break;
            
                    case 2:
                    obj.pop();
                    
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