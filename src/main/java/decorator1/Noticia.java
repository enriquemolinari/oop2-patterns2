package decorator1;

public class Noticia {

    private String textoNoticia;

    public Noticia(String textoNoticia) {
        this.textoNoticia = textoNoticia;
    }

    public void informar() {
        System.out.print("[" + this.textoNoticia + "]");
    }
}
