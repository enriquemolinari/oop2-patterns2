package decorator1;

public class NoticiaSimple implements Noticia {

    private String textoNoticia;

    public NoticiaSimple(String textoNoticia) {
        this.textoNoticia = textoNoticia;
    }

    public void informar() {
        System.out.print("[" + this.textoNoticia + "]");
    }
}
