package decorator1;

import java.util.Locale;

public class NoticiaConFechaYPais extends NoticiaConFecha {
    public NoticiaConFechaYPais(String textoNoticia) {
        super(textoNoticia);
    }

    public void informar() {
        System.out.print("[En " + Locale.getDefault().getDisplayCountry() + " ");
        super.informar();
        System.out.print("]");
    }
}
