class Exam<T extends Number>
{
T[] ob;
Exam(T[] c)
{ 
ob=c;
}
double sum=0;
double avg;
double average()
{
for(int i=0;i<ob.length;i++)
{
sum = sum+ob[i].doubleValue();
}
avg = sum/ob.length;
return(avg);
}

boolean sameAvg(Stats<?> ob) 

{
if(average() == ob.average())
return true;
else
return false;
}
}
public class WildCard
 {
 public static void main(String[] args)
{ 
Integer i[] ={2,4,5,6,12,17};
Double d[] = {2.0 ,4.0,5.0,6.0,12.0,17.0 };
Exam<Integer> ex = new Exam<Integer>(i);
System.out.println("Average of integer value is    "+ex.average());

Exam<Double> ex2 = new Exam<Double>(d);
System.out.println("the average of double value is   "+ex2.average());

if(ex.sameAvg(ex2))
System.out.println("average is same");

else
System.out.println("average is different");
}
}