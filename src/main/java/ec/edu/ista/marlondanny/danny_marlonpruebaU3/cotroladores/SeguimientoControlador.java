package ec.edu.ista.marlondanny.danny_marlonpruebaU3.cotroladores;

import ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo.Proyecto;
import ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo.Seguimiento;
import ec.edu.ista.marlondanny.danny_marlonpruebaU3.servicio.SeguimientoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seguimiento")
public class SeguimientoControlador {

    @Autowired
    private SeguimientoServiceImpl seguimientoService;

    @GetMapping("/{id}")
    public ResponseEntity<Seguimiento> read(@PathVariable Long id) {
        Seguimiento seguimiento = seguimientoService.findById(id);
        if (!(seguimiento == null)) {
            return new ResponseEntity<>(seguimiento, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Seguimiento> create(@RequestBody Seguimiento seguimiento) {
        return new ResponseEntity<>(seguimientoService.save(seguimiento), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Seguimiento>> read() {
        return new ResponseEntity<>(seguimientoService.findByAll(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Seguimiento> update(@PathVariable Long id, @RequestBody Seguimiento seguimientoRes) {
        Seguimiento seguimiento = seguimientoService.findById(id);
        if (!(seguimiento == null)) {

            seguimiento.setPrioridad(seguimientoRes.getPrioridad());
            seguimiento.setFecha_entrega(seguimientoRes.getFecha_entrega());
            seguimiento.setTarea(seguimientoRes.getTarea());
            seguimiento.setDocente_responsable(seguimientoRes.getDocente_responsable());
            seguimiento.setDescripcion(seguimientoRes.getDescripcion());
            seguimiento.setEntregable(seguimientoRes.getEntregable());
            seguimiento.setEjecutado(seguimientoRes.getEjecutado());
            seguimiento.setGrupo(seguimientoRes.getGrupo());
            seguimiento.setCosto_fijo(seguimientoRes.getCosto_fijo());
            seguimiento.setHoras_estimadas(seguimientoRes.getHoras_estimadas());
            seguimiento.setHoras_actuales(seguimientoRes.getHoras_actuales());
            seguimiento.setObservacion(seguimientoRes.getObservacion());

            return new ResponseEntity<>(seguimientoService.save(seguimiento), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Seguimiento> delete(@PathVariable Long id) {
        Seguimiento proyecto = seguimientoService.findById(id);
        if (!(proyecto == null)) {
            seguimientoService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
