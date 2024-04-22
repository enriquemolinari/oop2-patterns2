package decorator1;

public class NoticiaBuilder {
    private NoticiaSimple noticia;
    private Noticia noticiaFinal;

    public NoticiaBuilder(NoticiaSimple noticia) {
        this.noticia = noticia;
        this.noticiaFinal = noticia;
    }

    public NoticiaBuilder conFecha() {
        this.noticiaFinal = new ConFecha(this.noticiaFinal);
        return this;
    }

    public NoticiaBuilder conPais() {
        this.noticiaFinal = new ConPais(this.noticiaFinal);
        return this;
    }

    public Noticia build() {
        return this.noticiaFinal;
    }
}
