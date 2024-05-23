package med.voll.api.models;

import med.voll.api.models.entities.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long>
{
}
