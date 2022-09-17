//21CE097 Manav Patel
//Write a program that illustrates the significance of interface default method.
interface DefultIn
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
    }
}
  

public class prac7 implements DefultIn {
    
    public void square(int a)
    {
        System.out.println(a*a);
    }
  
    public static void main(String args[])
    {
        prac7 d = new prac7();
        d.square(4);
  
        // default method executed
        d.show();
    }
}
