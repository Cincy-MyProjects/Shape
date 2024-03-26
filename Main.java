public class Main {
    public static void main(String[] args) {
        Circle objcircle = new Circle(5);
        Triangle objTriangle = new Triangle(4, 3, 5, 4);
        System.out.println("Circle Area:" + objcircle.calculateArea());
        System.out.println("Circle Parameter:" + objcircle.calculatePerimeter());

        System.out.println("Triangle Area:" + objTriangle.calculateArea());
        System.out.println("Triangle Area:" + objTriangle.calculatePerimeter());
    }
}
