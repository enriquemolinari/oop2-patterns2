package decorator2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var c = new Concurso(LocalDate.now(),
                LocalDate.now().plusDays(3),
                "Concurso ABC",
                new MailTrapNotificacion("smtp.bla"));
        c.inscribir("Jorge");
    }
}
