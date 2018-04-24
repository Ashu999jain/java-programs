import java.util.*;
class cdatastruct
{
public void insert(int a[],int n,int p,int v)
{
int i;

for (i=n-1;i>p-1;i++)
{
a[i+1]=a[i];
}
a[p-1]=v;
n=n+1;
for(i=0;i<=n;i++)
System.out.println(a[i]);
}
public static  void  main(String ar[])
{
	Scanner s=new Scanner(System.in);
int n,p,v;
int a[]=new int[20];
System.out.println("enter length of array");
n=s.nextInt();
System.out.println("enter array");
for(int i=0;i<n;i++)
{a[i]=s.nextInt();
}
System.out.println("enter value to add");
v=s.nextInt();
System.out.println("enter position");
p=s.nextInt();
cdatastruct ob=new cdatastruct();
ob.insert(a,n,p,v);

}}