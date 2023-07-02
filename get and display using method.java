package javaapplication1;
import java.util.Scanner;
class Emp
{
    int rno;
    String sname;
    float fees;
    Scanner s;
    
    
    void get()
    {
        s=new Scanner(System.in);
        System.out.println("Enter rno,name,fees");
        rno=s.nextInt();
        sname=s.next();
        fees=s.nextInt();
    }
    
    void display()
    {
         System.out.println("roll number"+rno+"\n name"+sname+"\n Fees"+fees);
    }
}
       
public class javaapplication1
{
    public static void main(String args[])
    {
        Emp e=new Emp();
        e.get();
        e.display();
    }
}