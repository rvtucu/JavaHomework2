public class ProductAdapter {
    private static final double CURS_SCHIMB = 4.5; // exemplu de curs valutar

    public static Produs convertToProdus(Product product) {
        return new Produs(
                product.getId(),
                product.getName(),
                product.getPriceUSD() * CURS_SCHIMB
        );
    }

    public static Product convertToProduct(Produs produs) {
        return new Product(
                produs.getId(),
                produs.getNume(),
                produs.getPretRON() / CURS_SCHIMB
        );
    }
}