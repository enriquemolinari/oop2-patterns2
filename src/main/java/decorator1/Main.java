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

        var noticia = new Noticia("La IA nos va a dejar sin trabajo...");
        noticia.imprimir();

    }
}