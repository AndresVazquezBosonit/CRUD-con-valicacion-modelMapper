package CRUDvalidacionDTOSmodelMapper.repository;

import CRUDvalidacionDTOSmodelMapper.entity.Person;
import CRUDvalidacionDTOSmodelMapper.entity.PersonOutputDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    List<Person> findByName(String name);
}
