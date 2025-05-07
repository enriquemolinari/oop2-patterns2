package decorator1;

public class Noticia {
    private String textoNoticia;

    public Noticia(String textoNoticia) {
        this.textoNoticia = textoNoticia;
    }

    public void imprimir() {
        System.out.println("[ " + textoNoticia + " ]");
    }
}
