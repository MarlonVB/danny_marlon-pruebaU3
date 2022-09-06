package ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Seguimiento {
    @Id
    private Long id;
    private String referencia;
    private String prioridad;
    private String fecha_entrega;
    private String tarea;
    private String docente_responsable;
    private String descripcion;
    private String entregable;
    private int ejecutado;
    private String grupo;
    private int costo_fijo;
    private int horas_estimadas;
    private int horas_actuales;
    private String observacion;

}
