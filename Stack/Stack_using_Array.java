import java.util.*;
 class Stack 
 {
    Scanner sc=new Scanner(System.in);
    
    
    int top =-1;
    int n=10;
    int a[]=new int[n];

    void push()
    {

        if(top == (n-1))
        {
            System.out.println("Overflow");
        }else{

            System.out.println("enter data");
            int i =sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.println("item inserted");

        }}
    

    void pop(){
        if(top==-1){
            System.out.println("underflow");
        }else{
            top=top-1;
            System.out.println("item deleted");
        }}

    

    void display(){
        System.out.println("items are:");
        for (int j = top; j>=0; j--) {
            System.out.print(a[j]+" ");
        }
        System.out.println();
    }

    


    
}


public class Stack_using_Array{
    
    public static void main(String[] args) {
        int d,l;

        Scanner sc=new Scanner(System.in);
        Stack obj=new Stack();
        do{
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
            System.out.println("Press 3 to display");
            System.out.println("Enter your choice");

            d=sc.nextInt();
            switch (d){
                case 1:
                    obj.push();
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