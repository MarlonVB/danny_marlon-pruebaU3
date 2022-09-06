package ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
public class Proyecto {

    @Id
    private Long id;
    private String referencia;
    private String nombre_del_proyecto;
    private String objetivo_estrategico;
    private String objetivo_tactico;
    private String estrategia;
    private String objetivo_operativo;

}
