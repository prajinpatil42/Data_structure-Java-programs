import java.util.*;

public class Array_Creation {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element:");

        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n + 1];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();

        }
        System.out.println("Elements are as follow:");

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] +

                    " ");

        }

        System.out.println("Enter index of new value to be inserted:");
        int m = sc.nextInt();

        System.out.println("Enter  new value to be inserted:");
        int j = sc.nextInt();

        for (int i = 0; i < n+1; i++) {
            if (i<m) {
                b[i]=a[i];
            }else if(i == m){
                b[i]= j;
            }else{
                b[i]=a[i-1];

            }



        }
        System.out.println("Elements are as follow:");

        for (int i = 0; i < n+1; i++) {

            System.out.print(b[i] +

                    " ");

        }


    }

}