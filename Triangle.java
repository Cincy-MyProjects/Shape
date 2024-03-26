public class Triangle extends Shape {
    double side1,side2,side3,height;
    Triangle(double side1,double side2,double side3,double height){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.height=height;
    }

    @Override
    public double calculateArea() {
        return (side2*height)/2;
    }

    @Override
    public double calculatePerimeter() {
        return side1+side2+side3;
    }
}
