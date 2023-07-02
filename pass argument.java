package first;
import java.util.Scanner;
  
class Three 
{
     int eid;
     String ename;
     float salary;
     
     void get(int eid,String ename,float salary)
     {
         this.eid=eid;
         this.ename=ename;
         this.salary=salary;
     }
     
     void show()
     {
         System.out.println("Employee id"+eid+"Employee name"+ename+"Employee Salary"+salary);
     }
}

public class First
{
    public static void main(String args[])
    { 
       int eid;
       String ename;
       float salary;
       
       Scanner s=new Scanner(System.in);
       
      
       System.out.println("Enter");
       eid=s.nextInt();
       ename=s.next();
       salary=s.nextInt();
       
        Three e=new Three();
       e.get(eid, ename, salary);
       e.show();
    }
}

