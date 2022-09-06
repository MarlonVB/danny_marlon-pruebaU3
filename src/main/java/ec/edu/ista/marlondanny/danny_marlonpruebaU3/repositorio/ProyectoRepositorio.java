package ec.edu.ista.marlondanny.danny_marlonpruebaU3.repositorio;


import ec.edu.ista.marlondanny.danny_marlonpruebaU3.modelo.Proyecto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepositorio extends MongoRepository<Proyecto, Long> {
}
