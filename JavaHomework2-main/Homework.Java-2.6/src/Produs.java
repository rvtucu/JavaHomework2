public class Produs {
    private int id;
    private String nume;
    private double pretRON;

    public Produs(int id, String nume, double pretRON) {
        this.id = id;
        this.nume = nume;
        this.pretRON = pretRON;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPretRON() {
        return pretRON;
    }
}