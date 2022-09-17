package mypackage;
//import  packages and class 
import mypackage.*;
import mysub.pac2;
import mymulti.pac3;

public class pac1 {
    public static void main(String[] args) {
       pac p1=new pac();
       System.out.println( p1.add(1,2));
       pac2 p2 = new pac2();
       System.out.println(p2.sub(10,8));
       pac3 p3=new pac3();
       System.out.println(p3.multi(5,4));
       pac4 p4=new pac4();
       System.out.println(p4.divide(10,100));
    }
}
