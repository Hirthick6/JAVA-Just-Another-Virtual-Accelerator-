package three;
class Student
{
    int rno;
    String name;
    float fees;
    Student()
    {
         rno=1;
         name="ram";
         fees=2000;
    }
    Student(int x,String y)
    {
         rno=x;
         name=y;
    }
    Student(String y,float z)
    {
       
         name=y;
         fees=z;
         
    }    
    void show()
    {
        System.out.println(rno+","+name+","+fees);
    }
    
    void show1()
    {
        System.out.println(rno+","+name);
    }
    
    void show2()
    {
        System.out.println(name+","+fees);
    }
}
public class Three {
    public static void main(String[] args) {
     
        Student s=new Student();
        s.show();
        
        Student s1=new Student(1,"ragu");
        s1.show1();
        
        Student s2=new Student("ragul",3);
        s2.show2();
    }
}

