package GroupProject2CodingTasks;
/*
Questions #6
Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
 Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
  Test your code.
 */
public interface Shape {

     double calculateArea();

      double calculatePerimeter();

}
class Circle implements Shape{
    double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculateArea(){
            double pi=3.14;
        double result=(radius*radius)*pi;

            return result;
    }
    @Override
    public double calculatePerimeter(){
        double pi=3.14;
        double result=(2*pi)*radius;

        return result;

    }

}

class Square implements Shape{
        double sides;
        Square(double sides){
            this.sides=sides;
        }

    @Override
    public double calculateArea() {
            double area=sides*sides;

            return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter=4*sides;

        return perimeter;
    }
}

class ShapeTester{
    public static void main(String[] args) {

        Shape circle=new Circle(5);
       double result= circle.calculatePerimeter();
        double result2=circle.calculateArea();
        System.out.println("The perimeter of the circle is: "+result);
        System.out.println("The area of the circle is: "+result2);

        System.out.println("**********************************");

        Shape square=new Square(6);
      double result3= square.calculateArea();
      double result4= square.calculatePerimeter();
        System.out.println("The area of the square is: "+result3);
        System.out.println("The perimeter of the square is: "+result4);




    }

}