package api.rest.fisi.api.service;
import java.util.List;
import api.rest.fisi.api.entity.Registros;
public interface IRegistrosService {
    // listar registros de la tabla
    List<Registros> buscarTodos();

    // Guardar los registro
    void guardar(Registros registro);
}
