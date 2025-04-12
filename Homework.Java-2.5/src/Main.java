public class Main {
    public static void main(String[] args) {
        C2Nr c2 = new C2Nr(1, 2);
        C3Nr c3 = new C3Nr(1, 2, 3);

        System.out.println("Suma C2Nr: " + c2.getSum());
        System.out.println("Suma C3Nr: " + c3.getSum());

        C3Nr adapted = new C2NrToC3NrAdapter(c2);
        System.out.println("Suma adaptata: " + adapted.getSum());
    }
}