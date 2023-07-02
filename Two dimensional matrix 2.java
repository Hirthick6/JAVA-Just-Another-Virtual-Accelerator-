package first;
import java.util.Scanner;
  
class Three 
{
   int a[][],r,c,i,j;
   
   
   
   void get()
   {
       Scanner s=new Scanner(System.in);
         System.out.println("enter rows and columns");
       r=s.nextInt();
       c=s.nextInt();
       a=new int[r][c];
       
       for(i=0;i<r;i++)
       {
           for(j=0;j<c;j++)
           {
              a[i][j]=s.nextInt();
           }
      }
   }
   
   void show()
   {
       for(i=0;i<r;i++)
       {
           for(j=0;j<c;j++)
           {
               if((i+j)==c-1)
                   a[i][j]=0;
              System.out.println(a[i][j]); 
           }
           System.out.println("\t");
       }
   }
    
      
   
}  


public class First
{
    public static void main(String args[])
    { 
       Three t=new Three();
       t.get();
       t.show();
    }
}



