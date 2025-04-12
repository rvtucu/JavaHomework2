public class Main {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(3, 4);
        ComplexNumber c2 = new ComplexNumber(1, 2);
        Double d1 = 5.0;
        Double d2 = 7.0;

        System.out.println("Suma complex + complex: " + ComplexOperations.suma(c1, c2));
        System.out.println("Suma double + double: " + ComplexOperations.suma(d1, d2));
        System.out.println("Suma complex + double: " + ComplexOperations.suma(c1, d1));
        System.out.println("Suma double + complex: " + ComplexOperations.suma(d2, c2));
    }
}