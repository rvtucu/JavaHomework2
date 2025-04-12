public class Main {
    public static void main(String[] args) {
        Prelungitor prelungitor = new Prelungitor();

        Aparat frigider = new Aparat("Frigider");
        Aparat cafetiera = new Aparat("Aparatul de cafea");
        Aparat tv = new Aparat("Televizor");

        prelungitor.conecteazaAparat(frigider);
        prelungitor.conecteazaAparat(cafetiera);
        prelungitor.conecteazaAparat(tv);

        System.out.println("Baga prelungitorul in priza:");
        prelungitor.bagaInPriza();

        System.out.println("\nScoate prelungitorul din priza:");
        prelungitor.scoateDinPriza();
    }
}