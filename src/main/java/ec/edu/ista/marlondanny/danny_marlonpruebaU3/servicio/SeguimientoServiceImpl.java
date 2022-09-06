package ec.edu.ista.marlondanny.danny_marlonpruebaU3.servicio;

import ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo.Seguimiento;
import ec.edu.ista.marlondanny.danny_marlonpruebaU3.repositorio.SeguimientoRepositorio;
import ec.edu.ista.marlondanny.danny_marlonpruebaU3.servicio.generic.GenericServiceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class SeguimientoServiceImpl extends GenericServiceImplement<Seguimiento,Long> implements SeguimientoService{

    @Autowired
    private SeguimientoRepositorio seguimientoRepositorio;

    @Override
    public CrudRepository<Seguimiento, Long> getDao() {
        return seguimientoRepositorio;
    }
}
