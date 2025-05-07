package builder;

import decorator1.ConFecha;
import decorator1.DefaultNoticia;
import decorator1.Noticia;

import java.time.LocalDate;

public class NoticiaBuilder {
    private Noticia noticia;


    public NoticiaBuilder(String noticia) {
        this.noticia = new DefaultNoticia(noticia);
    }

    public NoticiaBuilder conEmoji(String emoji) {
        this.noticia = new decorator1.ConEmoji(this.noticia, emoji);
        return this;
    }

    public NoticiaBuilder conPais(String pais) {
        this.noticia = new decorator1.ConPais(this.noticia, pais);
        return this;
    }

    public NoticiaBuilder conFecha(LocalDate fecha) {
        this.noticia = new ConFecha(this.noticia, fecha);
        return this;
    }

    public Noticia build() {
        return this.noticia;
    }
}
