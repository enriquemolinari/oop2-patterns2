package decorator1;

import java.util.Locale;

public class ConEmoji extends NoticiaCompleja {
    private String emoji;

    public ConEmoji(Noticia noticia, String emoji) {
        super(noticia);
        this.emoji = emoji;
    }
    public void informar() {
        System.out.print("[" + this.emoji + " ");
        noticia.informar();
        System.out.print("]");
    }
}
