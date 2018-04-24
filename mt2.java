
import java.lang.Thread;
class first extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {

               System.out.println("first class"+i);
                if(i==3) 
               Thread.yield();
                         
                
            
        }
    }
}

class second extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("second class"+i);
         
             
        }
    }
}
public class mt2 
{
    public static void main(String ar[])
    {
 first t1=new first();
 second t2=new second();
    t1.start();
    t2.start();
  
}}
