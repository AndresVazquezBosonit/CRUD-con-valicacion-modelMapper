package CRUDvalidacionDTOSmodelMapper.PersonController;

import CRUDvalidacionDTOSmodelMapper.entity.PersonInputDTO;
import CRUDvalidacionDTOSmodelMapper.entity.PersonOutputDTO;
import CRUDvalidacionDTOSmodelMapper.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping
    public PersonOutputDTO newPerson(@RequestBody PersonInputDTO personInputDTO) throws Exception {
        return personService.addPerson(personInputDTO);
    }

    @GetMapping
    public List<PersonOutputDTO> personList() {
        return personService.listPerson();
    }

    @GetMapping("/{id}")
    public PersonOutputDTO personById(@PathVariable int id) throws Exception {
        return personService.personById(id);
    }

    @GetMapping("/name")
    public List<PersonOutputDTO> personListByName(@RequestParam String name) throws Exception {
        return personService.personByName(name);
    }

    @DeleteMapping("/{id}")
    public String deletePerson(@PathVariable int id) throws Exception {
        return personService.deletePersona(id);
    }

    @PutMapping("/{id}")
    public PersonOutputDTO updatePerson(@RequestBody PersonInputDTO person, @PathVariable int id)
            throws Exception {
        return personService.updatePerson(person, id);
    }
}
