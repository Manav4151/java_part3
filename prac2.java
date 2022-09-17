//21CE097 Manav Patel
/*
 Write a program to create a default method in an interface IPrinter. Create an interface IPrinter and IScanner. You can assume variables and methodsfor both interfaces. Create a concrete class to implement both the interfaces. Create 5 objects of the class, store it in Vector and display the result of the vector.
 */
import java.util.Vector;
interface Iprinter{
    default  void iscan(){
         System.out.println("IPrinter is called");
    }
}
interface Iscanner{
    void Iscan();
}
class concrete implements Iprinter,Iscanner{
    public void Iscan(){
        System.out.println("IScanner is called");
    }
            
}
public class prac2 {
    public static void main(String[] args) {
        concrete c1= new concrete();
        c1.iscan();
        c1.iscan();
        Vector<Integer> conrete = new Vector<Integer>();
    {
        conrete.add(1);
        conrete.add(2);
        conrete.add(3);
        conrete.add(4);
        conrete.add(5);
        System.out.println("Vector: " + conrete);
       
    }
    }
}
