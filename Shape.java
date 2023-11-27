class Shape{
    public double calculatearea(){
        return 0.0;

    }
}
class circle extends Shape{
    private double radius ;
    public circle (double radius){
        this.radius=radius;
        
    }
    public double calculate area(){
        return Math.PI*radius*radius;
        }
    }
class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(double width , double height)
    {
        this.width= width;
        this.height = height;

    }
    public double calculate area(){
        return width*height;
    }
}
public class main{
    public static void main(String[]args)
    {
        circle circle = new circle(5.0);
        rectangle rectangle = new rectangle(4.0, 6.0);
        system.out.println(" area of circle"+circle.circle.calculatearea());
        system.out.println(" area of rectangle"+ rectangle.rectangle.calculatearea());
    }
}