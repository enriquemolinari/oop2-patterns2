package decorator1;

public abstract class NoticiaCompleja implements Noticia {

    protected Noticia noticia;

    public NoticiaCompleja(Noticia noticia) {
        this.noticia = noticia;
    }
}
