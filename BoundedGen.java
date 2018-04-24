class exam<t extends Number>
{
t[] ob;
exam(t[] o)
{

ob =o;
}
 
 
double average()
{
Integer sum=0;
for(Integer i=0;i<ob.length;i++)
{
sum = sum + (Integer)ob[i];
}
return(sum/ob.length);
}
}

public class BoundedGen
{
public static void main(String []args)
{
Integer a[] = {1,2,3,4,5};
exam<Integer> ex = new exam<Integer>(a);
System.out.println("the output average is  "+ex.average);
}
}