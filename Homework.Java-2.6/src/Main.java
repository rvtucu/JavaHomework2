public class Main {
    public static void main(String[] args) {
        Product laptop = new Product(1, "Laptop", 1000.0);
        Produs laptopRON = ProductAdapter.convertToProdus(laptop);

        System.out.println("Produs in RON: " + laptopRON.getNume() + " - " + laptopRON.getPretRON() + " RON");

        Produs telefon = new Produs(2, "Telefon", 4500.0);
        Product telefonUSD = ProductAdapter.convertToProduct(telefon);

        System.out.println("Product in USD: " + telefonUSD.getName() + " - " + telefonUSD.getPriceUSD() + " USD");
    }
}