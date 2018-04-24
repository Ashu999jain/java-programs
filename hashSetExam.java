import java.util.*;
class hashSetExam
{
public static void main(String [] args)
{
HashMap<Integer, String> hash = new HashMap<Integer, String>();
hash.put(10,"rahul");
hash.put(11,"sanjay");
hash.put(12,"yatharht");
hash.put(13,"rahul");
for(Map.Entry m :hash.entrySet())
{
System.out.println(m.getKey()+"   "+m.getValue());
}
}
}