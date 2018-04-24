

  class test extends Thread
  {
      public void run()
      {
          for(int i=0;i<=3;i++)
          {
              System.out.println("thread "+i);
      
      
  }}
 class test2 extends Thread
  {
      public void run()
      {
          for(int i=0;i<=3;i++)
          {
              System.out.println("ashu1 "+i);
             
                
          }
          
      }
      
      
  }
public class mt1 {
  public static void main(String[] args) {
      test t1=new test();
      test2 t2 =new test2();
      t1.start();
      t2.start();
      try{
          t2.join();
        
  }
      catch(Exception e)
      {
          System.out.println("error");
      }
  }
}

