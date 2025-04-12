public class Main {
    public static void main(String[] args) {
        Shape rectangle = ShapeFactory.createShape("rectangle", 5.5f, 3.2f);
        Shape circle = ShapeFactory.createShape("circle", 4.8f);

        System.out.println("Rectangle area: " + rectangle.computeArea());
        System.out.println("Circle area: " + circle.computeArea());
    }
}