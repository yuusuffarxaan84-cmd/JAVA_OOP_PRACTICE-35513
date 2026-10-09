abstract class Shape {
abstract double area();
}
class Rectangle extends Shape {
double width;
double height;
Rectangle(double width, double height) {
this.width = width;
this.height = height;
}
@Override
double area() {
return width * height;
}
}
public class AbstractionDemo {
public static void main(String[] args) {
Shape shape = new Rectangle(5, 4);
System.out.println("Area = " + shape.area());
}
}