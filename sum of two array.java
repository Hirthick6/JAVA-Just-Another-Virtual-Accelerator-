
package first;
import java.util.Scanner;
  
class Three 
{
   int a[],b[],n1,n2,i;
   
   void get()
   {
       Scanner s=new Scanner(System.in);
       System.out.println("enter size1");
       n1=s.nextInt();
       System.out.println("enter size1");
       n2=s.nextInt();
       a=new int[n1];
       b=new int[n2];
       
       
      if (n1 != n2) {
            System.out.println("Sizes are different. Exiting the program.");
            return; 
        }
       
       
       System.out.println("Enter Elemts");
       
       for(i=0;i<n1;i++)
       {
               a[i]=s.nextInt();
       }
       for(i=0;i<n2;i++)
       {
               b[i]=s.nextInt();
       }
      

       System.out.println("Elemts are");
       for(i=0;i<n1;i++)
       {         
        System.out.print(a[i]+b[i]+"\t");
       }
       
               
   }
       
 }

  


public class First
{
    public static void main(String args[])
    { 
       Three t=new Three();
       t.get();
       
    }
}





