package decorator1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConFecha extends NoticiaCompleja {

    public ConFecha(Noticia noticia) {
        super(noticia);
    }

    public void informar() {
        System.out.print("[Hoy es "
                + LocalDate.now().
                format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                + " ");
        noticia.informar();
        System.out.print("]");
    }
}