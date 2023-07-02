package three;

import java.util.Scanner;


public class Three {
    public static void main(String[] args) {
     int n,a[],i;
     Scanner s= new Scanner(System.in);
     
     System.out.println("Enter array Size");
     n=s.nextInt();
     a=new int[n];
     
     System.out.println("enter elements");
     for(i=0;i<n;i++)
     {
         a[i]=s.nextInt();
     }
     
     
     System.out.println("elements are");
     for(i=0;i<n;i++)
     {
         System.out.println(a[i]);
     }
    }
}


