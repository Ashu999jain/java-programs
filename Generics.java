import java.util.*;
class Exam<g>
{
g i;
 Exam(g ob)
 {
 i = ob;
 }
 g disp()
 {
 return(i);
 }
 }
 public class Generics
 {
 public static void main(String [] args)
{
Scanner scan = new Scanner(System.in);
System.out.println("enter the integer");

 Integer i = new Integer(scan.nextInt());
 System.out.println("enter the String");

 String s = new String(scan.next());
 
 Exam<Integer> ex1 = new Exam<Integer>(i);
 
Exam<String> ex2 = new Exam<String>(s);

System.out.println("the integer you enter is "+ex1.disp());
 System.out.println("the String you enter is "+ex2.disp());
}
}