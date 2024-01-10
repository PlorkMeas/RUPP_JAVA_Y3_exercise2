public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(16, 10);
        System.out.println("Rectangle Area : " + rectangle.getArea());
        System.out.println("Rectangle Perimeter : " + rectangle.getPerimeter());
        System.out.println("\n\n==============================================");
        Square square = new Square(10);
        System.out.println("Square Area : " + square.getArea());
        System.out.println("Square Perimeter : " + square.getPerimeter());
    }
}