public class ShapeFactory {
    public static Shape createShape(String shapeType, float... dimensions) {
        return switch (shapeType.toLowerCase()) {
            case "rectangle" -> new Rectangle(dimensions[0], dimensions[1]);
            case "circle" -> new Circle(dimensions[0]);
            default -> throw new IllegalArgumentException("Unsupported shape type");
        };
    }
}