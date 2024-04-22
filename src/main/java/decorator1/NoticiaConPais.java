package decorator1;

import java.util.Locale;

public class NoticiaConPais extends Noticia {
    public NoticiaConPais(String textoNoticia) {
        super(textoNoticia);
    }

    public void informar() {
        System.out.print("[En " + Locale.getDefault().getDisplayCountry() + " ");
        super.informar();
        System.out.print("]");
    }
}
