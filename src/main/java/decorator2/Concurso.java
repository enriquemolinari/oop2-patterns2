package decorator2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Concurso {
    private List<String> participantes;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String nombre;
    private Notificacion notificacion;

    public Concurso(LocalDate fechaInicio, LocalDate fechaFin, String nombre, Notificacion notificacion) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.nombre = nombre;
        this.notificacion = notificacion;
        this.participantes = new ArrayList<>();
    }

    public void inscribir(String nombreParticipante) {
        //if fecha de inscripcion entre inicio y fin
        this.participantes.add(nombreParticipante);
        this.notificacion.notificar("Usted se ha inscripto al concurso: " + nombreParticipante);
    }
}
