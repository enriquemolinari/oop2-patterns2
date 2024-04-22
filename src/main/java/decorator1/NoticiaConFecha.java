package decorator1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NoticiaConFecha extends Noticia {
    public NoticiaConFecha(String textoNoticia) {
        super(textoNoticia);
    }

    public void informar() {
        System.out.print("[Hoy es "
                + LocalDate.now().
                format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                + " ");
        super.informar();
        System.out.print("]");
    }
}
