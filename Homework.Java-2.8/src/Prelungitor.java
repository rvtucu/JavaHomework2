import java.util.ArrayList;
import java.util.List;

public class Prelungitor {
    private List<AparatElectric> aparate = new ArrayList<>();
    private boolean esteConectat;

    public void conecteazaAparat(AparatElectric aparat) {
        aparate.add(aparat);
        if (esteConectat) {
            aparat.onConectat();
        }
    }

    public void bagaInPriza() {
        esteConectat = true;
        for (AparatElectric aparat : aparate) {
            aparat.onConectat();
        }
    }

    public void scoateDinPriza() {
        esteConectat = false;
        for (AparatElectric aparat : aparate) {
            aparat.onDeconectat();
        }
    }
}