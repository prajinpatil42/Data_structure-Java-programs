
import java.util.*;

 class Queue3 {

    int f= -1;
    int r=-1;
    int n=5;


    int q[]=new int[n];

    void enqueue(Scanner sc)
    {
        if(f==(r+1)%n)
        {
            System.out.println("overflow condition");
        }else{
            System.out.println("Enter Data:");
            int i=sc.nextInt();
            if(f == -1 && r == -1)
            {
                f=0;
                r=0;
                q[r]=i;

            }else{

                r=(r+1)%n;
                q[r]=i;

            }
        }

    }

    void dequeue()
    {
        if(f==-1 && r==-1)
        {
            System.out.println("Underflow");
        }else if(f==r){

            System.out.println("underflow condition");
            f=-1;
            r=-1;

        }
            else{
            f=(f+1)%n;
        }

    }

    void display(){
        int i;

        System.out.println("Items are:");
        for (i = f; i!= r; i=(i+1)%n) {

            System.out.print(q[i]+" ");
            
        }
       
        System.out.print(q[i]);
        System.out.println();



    }
    
    
}



public class Circular_queue{
    
    public static void main(String[] args) {
        int d,l;

        Scanner sc=new Scanner(System.in);
        Queue3 obj=new Queue3();
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