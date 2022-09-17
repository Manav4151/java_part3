//21CE097 Manav Patel
/*
 Aim: WAP that illustrate the interface inheritance. Interface P is extended by P1 and P2 interfaces.2 1,2 Interface P12 extends both P1 and P2. Each interface declares one method and one constant.Create one class that implements P12.By using the object of the class invokes each of its method and displays constant.
 */

interface P
{
    final int p=97;
    void displayP();
}
interface P1 extends P
{
    final int p1=98;
    void displayP1();
}
interface P2 extends P
{
    final int p2=103;
    void displayP2();
}
interface P12 extends P1,P2
{
    final int p12=114;
    void displayP12();
}
class Print implements P12
{
    public void displayP()
    {
        System.out.println("Display P   : "+p);
    }
    public void displayP1()
    {
        System.out.println("Display P1  : "+p1);
    }
    public void displayP2()
    {
        System.out.println("Display P2  : "+p2);
    }
    public void displayP12()
    {
        System.out.println("Display P12 : "+p12);
    }
    
}
class prac3
{
    public static void main(String arg[])
    {
        Print  objp = new Print();
        objp.displayP();
        objp.displayP1();
        objp.displayP2();
        objp.displayP12();
    }
}

