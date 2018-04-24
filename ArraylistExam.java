import java.util.*;
class  ArraylistExam
{
public static void main(String [] rags)
{
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);

ArrayList<Integer> al2 = new ArrayList<Integer>();
al2.add(6);
al2.add(7);
al2.add(8);
al.addAll(al2);
al.remove(3);
for(int i: al)
System.out.println(i);
}
}