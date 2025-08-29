package Interface_practise;
interface Shape 
{
	
    void draw();
    double area();
    
public class Circle implements Shape 
{
     private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public void draw() {
            System.out.println("Drawing a Circle");
        }

        public double area() {
            return Math.PI * radius * radius;
        }
}
public class Rectangle implements Shape 
{
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

    public void draw() {
        System.out.println("Drawing a Rectangle");
    }

    public double area() {
        return length * width;
    }
}

public class SHAPES 
{
	public static void main(String[] args) {
        Shape c = new Circle(5.0);
        Shape r = new Rectangle(4.0, 3.0);

        c.draw();
        System.out.println("Circle Area: " + c.area());

        r.draw();
        System.out.println("Rectangle Area: " + r.area());
    }
}
}
