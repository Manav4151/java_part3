// 21CE097 Manav Patel
//Develop a Program that illustrate method overriding concept.
class A{
    public void meth(){
        System.out.println("I am method of class A");
    }
}

class B extends A{
    @Override //Method overriding 
    public void meth(){
        System.out.println("I am method of class B");
    }


}
public class prac4 {
    public static void main(String[] args) {
        A a = new A();
        a.meth();

        B b = new B();
        b.meth();
    }
}
