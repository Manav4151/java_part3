public class TestGeometricobject {
    public static void main(String[] args)
    {
    circle obj = new circle("red",true,4);
    ractangle obj1 = new ractangle("blue",true,7,8);

    double area = obj.Area();
    double perimeter = obj.perimeter();

        double area1 = obj1.Area();
        double perimeter1 = obj1.perimeter();
    System.out.println( "Availability : "+ obj.filled() + "\nthe color is : " + obj.string());
    System.out.println("Area of circle is : " + area );
    System.out.println("Perimeter of circle : " + perimeter);

        System.out.println( "Availability : "+ obj.filled() + "\nthe color is : " + obj1.string());
        System.out.println("Area of ractangle is : " + area1 );
        System.out.println("Aerimeter of ractangle : " + perimeter1);
    }
}
