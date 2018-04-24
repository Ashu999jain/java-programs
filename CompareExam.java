class Book
{

Integer x =9;
Integer y =4;
CompareExam b;
Book(CompareExam c)
{
b=c;	
}
public void CompareTo()
{
	if(b.x>y)
		System.out.println("it  works ");
	else
System.out.println("it not works ");
}

}
public class CompareExam{
	int x;
	CompareExam(int r)
	{
		x=r;
	}
		public static void main(String [] args)
		{
			CompareExam b2 = new CompareExam(90);
			System.out.println("object of CompareExam is created");
             Book b = new Book(b);		
		}
}