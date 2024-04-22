package decorator1;

import java.util.Locale;

public class ConPais extends NoticiaCompleja {
    public ConPais(Noticia noticia) {
        super(noticia);
    }

    public void informar() {
        System.out.print("[En " + Locale.getDefault().getDisplayCountry() + " ");
        noticia.informar();
        System.out.print("]");
    }
}
