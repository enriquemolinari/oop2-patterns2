package decorator1;

import java.lang.reflect.Constructor;
import java.util.*;

public class NoticiaBuilderOrdered {
    private NoticiaSimple noticia;
    private Map<Class<? extends NoticiaCompleja>, Integer> orden;
    private List<Class<? extends NoticiaCompleja>> elegidos;
    private Noticia noticiaFinal;

    public NoticiaBuilderOrdered(NoticiaSimple noticia) {
        this.noticia = noticia;
        this.noticiaFinal = noticia;
        this.orden = new HashMap<>();
        this.elegidos = new ArrayList<>();
        this.orden.put(ConPais.class, 1);
        this.orden.put(ConFecha.class, 2);
    }

    public NoticiaBuilderOrdered conFecha() {
        this.elegidos.add(ConFecha.class);
        return this;
    }

    public NoticiaBuilderOrdered conPais() {
        this.elegidos.add(ConPais.class);
        return this;
    }

    public Noticia build() {
        Collections.sort(this.elegidos, Comparator.comparingInt(orden::get));
        try {
            for (var clazz : this.elegidos) {
                Constructor<?> constructor = clazz.getConstructor(Noticia.class);
                Noticia decorador = (Noticia) constructor.newInstance(noticiaFinal);
                noticiaFinal = decorador;
            }
            return this.noticiaFinal;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
