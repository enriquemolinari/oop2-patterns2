package decorator2;

public class MailTrapNotificacion implements Notificacion {

    private String smtp;

    public MailTrapNotificacion(String smtp) {
        this.smtp = smtp;
    }

    @Override
    public void notificar(String mensaje) {
        // enviando mail...
    }
}
