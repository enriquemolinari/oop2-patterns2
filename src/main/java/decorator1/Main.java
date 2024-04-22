package decorator1;

public class Main {
    public static void main(String[] args) {
        //Quiero ahora Saludar con Fecha y Pais, como hago?
        //Creo una nueva subclase que extienda de una de las dos ConFecha o ConPais
        //tengo que ver como saco el codigo duplicado
        //Si agregara un nueva opcion: SaludoConEmoji, las combinaciones
        // de nuevas clases se van exponencialmente
        var s = new NoticiaConFechaYPais("Aumento en los combustibles...");
        s.informar();
    }
}