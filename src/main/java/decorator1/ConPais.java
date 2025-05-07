package decorator1;

public class ConPais implements Noticia {
    private Noticia noticia;
    private final String pais;

    public ConPais(Noticia noticia, String pais) {
        this.noticia = noticia;
        this.pais = pais;
    }


    @Override
    public void imprimir() {
        System.out.println(this.pais);
        this.noticia.imprimir();
    }
}
