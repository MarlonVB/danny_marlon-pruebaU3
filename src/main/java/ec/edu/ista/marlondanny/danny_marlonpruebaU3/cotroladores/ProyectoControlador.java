package ec.edu.ista.marlondanny.danny_marlonpruebaU3.cotroladores;

import ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo.Proyecto;
import ec.edu.ista.marlondanny.danny_marlonpruebaU3.servicio.ProyectoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proyecto")
public class ProyectoControlador {

    @Autowired
    private ProyectoServiceImpl proyectoService;

    @GetMapping("/{id}")
    public ResponseEntity<Proyecto> read(@PathVariable Long id) {
        Proyecto estudiante = proyectoService.findById(id);
        if (!(estudiante == null)) {
            return new ResponseEntity<>(estudiante, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<Proyecto> create(@RequestBody Proyecto proyecto) {
        return new ResponseEntity<>(proyectoService.save(proyecto), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Proyecto>> read() {
        return new ResponseEntity<>(proyectoService.findByAll(), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Proyecto> update(@PathVariable Long id, @RequestBody Proyecto proyectoRes) {
        Proyecto proyecto = proyectoService.findById(id);
        if (!(proyecto == null)) {

            proyecto.setNombre_del_proyecto(proyectoRes.getNombre_del_proyecto());
            proyecto.setObjetivo_estrategico(proyectoRes.getObjetivo_estrategico());
            proyecto.setObjetivo_tactico(proyectoRes.getObjetivo_tactico());
            proyecto.setEstrategia(proyectoRes.getEstrategia());
            proyecto.setObjetivo_operativo(proyectoRes.getObjetivo_operativo());

            return new ResponseEntity<>(proyectoService.save(proyecto), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Proyecto> delete(@PathVariable Long id) {
        Proyecto proyecto = proyectoService.findById(id);
        if (!(proyecto == null)) {
            proyectoService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
