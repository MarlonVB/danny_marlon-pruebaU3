package ec.edu.ista.marlondanny.danny_marlonpruebaU3.servicio;

import ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo.Proyecto;
import ec.edu.ista.marlondanny.danny_marlonpruebaU3.repositorio.ProyectoRepositorio;
import ec.edu.ista.marlondanny.danny_marlonpruebaU3.servicio.generic.GenericServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServiceImpl extends GenericServiceImplement<Proyecto,Long> implements ProyectoService{

    @Autowired
    private ProyectoRepositorio proyectoRepositorio;

    @Override
    public CrudRepository<Proyecto, Long> getDao() {
        return proyectoRepositorio;
    }
}
