
public class NestedTry {
public static void main(String [] args)
{
  try 
  {
      int a = 3/0;
      try
      {
         int  c[] ={1};
		 c[34]=56;
          
      }
      catch (ArrayIndexOutOfBoundsException e)
      {//
          
          System.out.println("array out of bound  error  nested catch");
      }
      
  }
  catch (ArithmeticException e)
  {
      System.out.println("arithmetic error first try block");
  }
  finally
  {
      System.out.println("finally is alaways executed");
  }
}    


    
    
    
    
    
}
