import java.util.*;

public class Arrat_Delete {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of element:");

        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n - 1];

        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();

        }
        System.out.println("Elements are as follow:");

        System.out.println("Enter index of new value to be deleted:");
        int m = sc.nextInt();

        

        for (int i = 0; i < n; i++) {
            if (i < m) {
                b[i] = a[i];
            } else if (i == m) {
                continue;
            } else{

                b[i-1]=a[i];


            }

        }
        System.out.println("Elements are as follow:");

        for (int i = 0; i < n - 1; i++) {

            System.out.print(b[i]+" ");

        }

    }

}