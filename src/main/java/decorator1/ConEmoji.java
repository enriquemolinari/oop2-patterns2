package decorator1;

public class ConEmoji implements Noticia{
    private String emoji;
    private Noticia noticia;

    public ConEmoji(Noticia noticia, String emoji) {
        this.emoji = emoji;
        this.noticia = noticia;
    }

    @Override
    public void imprimir() {
        this.noticia.imprimir();
        System.out.println(this.emoji);
    }
}
