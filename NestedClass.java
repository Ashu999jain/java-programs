class Exam
{
int a ;
int b;
Exam(int x, int y)
{
a=x;
b=y;
}
void showdata()
{
System.out.println("the a in Exam class is  "+a);
System.out.println("the b in Exam class is  "+b);
}

class InnerClass
{

int a; 
int b; 
InnerClass(int x , int y)
{
a= x;
b=y;
}
 void showdata()
{
 System.out.println("the a in iner class is  "+a);
System.out.println("the b in inner class is  "+b);
}
}
}

public class NestedClass
{
public static void main(String args[])
{
Exam ex = new Exam(10,20);
ex.showdata();
Exam.InnerClass inner = ex.new InnerClass(12,34);
inner.showdata();
}
}
