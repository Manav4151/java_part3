//21CE097 Manav Patel
/*
 Create an abstract class GeometricObject as the superclass for Circle and Rectangle. GeometricObject models common features of geometric objects. Both Circle and Rectangle contain the getArea() and getPerimeter() methods for computing the area and perimeter of a circle and a rectangle. Since you can compute areas and perimeters for all geometric objects, so define the getArea() and getPerimeter() methods in the GeometricObject class. Give implementation in the specific type of geometric object. Create TestGeometricObject class to display area and perimeter of Rectangle and Triangle, compare area of both and display results.Design of all classes are given in the following UML diagram.
 */

abstract public class Geometricobject {
    public int Radius;
    public String color;
    public boolean filled;
    public int length;
    public int width;

    public Geometricobject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    public void getcolor(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String string()
    {
       return color;
    }
    public boolean filled()
    {
        return filled;
    }

    public void getradius(int r){
        Radius = r;
    }
     public double Area(){
         return 0;
     }
     public double perimeter() {
         return 0;
     }
}
class circle extends Geometricobject
        {
            public circle(String color, boolean filled,int radius) {
                super(color, filled);
                Radius = radius;
            }


            public double Area() {
                return (3.14 * (Radius * Radius));
            }
            public double perimeter(){
                return (3.14 * (2 * Radius));
            }
}
class ractangle extends Geometricobject{
            public ractangle(String color,boolean filled,int length,int width)
            {
                super(color,filled);
                this.color = color;
                this.filled = filled;
                this.length = length;
                this.width = width;
            }
            public double Area(){
                return (length*width);
            }
            public double perimeter() {
                return (2*(length+width));
            }
}


        
   



