import java.util.Random;

public class Student {
    private String nume;
    private Random random;

    public Student(String nume) {
        this.nume = nume;
        this.random = new Random();
    }

    public String getNume() {
        return nume;
    }

    public String getStatusPrezenta() {
        return random.nextBoolean() ? "prezent" : "absent";
    }
}