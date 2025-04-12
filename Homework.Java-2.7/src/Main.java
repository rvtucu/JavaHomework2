public class Main {
    public static void main(String[] args) {
        Curs programare = new Curs("Programare Java");

        programare.inscrieStudent(new Student("Ionescu"));
        programare.inscrieStudent(new Student("Popescu"));
        programare.inscrieStudent(new Student("Georgescu"));

        programare.prezenta();
        programare.prezenta();
        programare.prezenta();
    }
}