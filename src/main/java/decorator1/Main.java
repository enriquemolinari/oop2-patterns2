package decorator1;

public class Main {
    public static void main(String[] args) {
        //Usando decoradores !
        var s = new ConFecha(new ConPais(new NoticiaSimple("A")));
        s.informar();

        //usando builder!
        var builder = new NoticiaBuilder(new NoticiaSimple("noticia 1"));
        builder.conFecha().conPais().build().informar();
        System.out.println();
        builder = new NoticiaBuilder(new NoticiaSimple("noticia 2"));
        builder.conPais().build().informar();
        System.out.println();
        builder = new NoticiaBuilder(new NoticiaSimple("noticia 3"));
        builder.conFecha().build().informar();

        //usando builder con orden!
        var builder2 = new NoticiaBuilderOrdered(new NoticiaSimple("noticia 1o"));
        builder2.conFecha().conPais().build().informar();
        System.out.println();
        builder2 = new NoticiaBuilderOrdered(new NoticiaSimple("noticia 1o"));
        builder2.conPais().conFecha().build().informar();
    }
}