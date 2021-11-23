package expertTeste.tuturial.rest.api.repository;

import expertTeste.tuturial.rest.api.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
