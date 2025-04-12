import java.util.ArrayList;
import java.util.List;

public class Curs {
    private String numeCurs;
    private List<Student> studentiInscrisi;

    public Curs(String numeCurs) {
        this.numeCurs = numeCurs;
        this.studentiInscrisi = new ArrayList<>();
    }

    public void inscrieStudent(Student student) {
        studentiInscrisi.add(student);
    }

    public void prezenta() {
        System.out.println("Prezenta la cursul " + numeCurs + ":");
        for (Student student : studentiInscrisi) {
            System.out.println("- " + student.getNume() + ": " + student.getStatusPrezenta());
        }
        System.out.println();
    }
}