public class ComplexAdapter {
    public static ComplexNumber toComplex(Double number) {
        return new ComplexNumber(number, 0.0);
    }

    public static Double toDouble(ComplexNumber number) {
        return number.getModulus();
    }
}