package ec.edu.ista.marlondanny.danny_marlonpruebaU3.repositorio;

import ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo.Seguimiento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguimientoRepositorio extends MongoRepository<Seguimiento, Long> {

}
