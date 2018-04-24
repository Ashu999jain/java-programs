interface MinMax<T extends Comparable<T>>
{
	void min();
	void max();
}
class Exam <T extends Comparable<T>> implements MinMax<T>

{
T o[];
Exam(T a[])
{
	o=a;
}
	public void min()
	{
	T k =o[0];
	for(int i=1;i<o.length;i++)
	{
	if(o[i].compareTo(k) < 0) 
	    k=o[i];
	}
	System.out.println("the smallest number is "+k);
	}
	
public void max()
	{
	T k=o[0];
	for(int i=1;i<o.length;i++)
	{
		if(o[i].compareTo(k) > 0)
	    k=o[i];
	}
	System.out.println("the largest number is "+k);
	}
}
public class GenericInterface
{
public static void main(String [] args)
{	
Integer a[] = {12,34,22,56,89,91,12};
Double d[] =  {1.2,3.4 ,6.7 , 8.9};
Exam<Integer> ex = new Exam<Integer>(a);
ex.max();
ex.min();
Exam<Double> ex2 = new Exam<Double>(d);
ex2.max();
ex2.min();
}
}	