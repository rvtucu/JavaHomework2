public class ComplexOperations {
    public static ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        return new ComplexNumber(
                nr1.getReal() + nr2.getReal(),
                nr1.getImaginary() + nr2.getImaginary()
        );
    }

    public static ComplexNumber suma(Double nr1, Double nr2) {
        return suma(ComplexAdapter.toComplex(nr1), ComplexAdapter.toComplex(nr2));
    }

    public static ComplexNumber suma(ComplexNumber nr1, Double nr2) {
        return suma(nr1, ComplexAdapter.toComplex(nr2));
    }

    public static ComplexNumber suma(Double nr1, ComplexNumber nr2) {
        return suma(ComplexAdapter.toComplex(nr1), nr2);
    }
}