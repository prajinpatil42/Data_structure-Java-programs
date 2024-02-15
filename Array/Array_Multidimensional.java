import java.util.*;


public class Array_Multidimensional {

    public static void main(String[] args) {

        int r,c,p;
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter no of rows:");

        r=sc.nextInt();


        System.out.println("Enter no of columns:");

        c=sc.nextInt();




        System.out.println("enter values:");


        int a[][]= new int[r][c];
        
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                a[i][j]=sc.nextInt();
                
            }

            
        }

        // int a[]={{1,2},{3,4},{5,6}};
        System.out.println("Elements are as follow:");
        for (int i = 0; i < r; i++) {

            for (int j = 0; j < c; j++) {
                
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println();

            
        }







        
    }
    
}
