package decorator1;

import builder.NoticiaBuilder;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Dada una Noticia, me piden:
        // 1- A veces quiero que salga en la noticia la fecha impresa
        // 2- A veces quiero que salga en la noticia el Pais de Origen
        // tiempo despues...
        // 3- A veces quiero que salga en la noticia el Pais de Origen y la fecha
        // tiempo despues...
        // 4- A veces tambien quiero que al final se imprima un emoji que indicara el sentimiento de la Noticia

        var franco = new ConFecha(
                new ConEmoji(
                        new DefaultNoticia("todo mal"), ":)"), LocalDate.now());
        franco.imprimir();

        var noticia = new NoticiaBuilder("todo mal")
                .conPais("Argentina")
                .conFecha(LocalDate.now())
                .conEmoji(":)")
                .build();
        noticia.imprimir();

    }
}