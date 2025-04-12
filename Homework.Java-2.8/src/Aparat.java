public class Aparat implements AparatElectric {
    private String nume;

    public Aparat(String nume) {
        this.nume = nume;
    }

    @Override
    public void onConectat() {
        System.out.println(nume + " a fost conectat la curent");
    }

    @Override
    public void onDeconectat() {
        System.out.println(nume + " a fost deconectat de la curent");
    }
}