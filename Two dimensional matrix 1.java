package first;
import java.util.Scanner;
  
class Three 
{
    int a[][],r,c,i,j;
    
    void get()
  {
       Scanner s=new Scanner(System.in);
       System.out.println("enter rows and colums");
       r=s.nextInt();
       c=s.nextInt();
       a=new int[r][c];
       
       System.out.println("enter elements");
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
          System.out.println("elements are");
           for(i=0;i<r;i++)
          {
              for(j=0;j<c;j++)
                {
                   if(i==j) 
                   { 
                      a[i][j]=0;
                   }
                   
                   System.out.println( a[i][j]+"\t");
                }
              System.out.println();
          } 
     }
    
}

public class First
{
    public static void main(String args[])
    { 
        Three ob=new Three();
        ob.get();
        ob.show();
      
    }
}
