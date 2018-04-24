class StringFunct
{
final public static void main(String [] args)
{
	String s= new String("hello world");
	char ch[] = s.toCharArray();
	for(char c : ch)
		System.out.println(c);
}
}