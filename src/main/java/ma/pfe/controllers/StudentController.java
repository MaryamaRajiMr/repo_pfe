package ma.pfe.controllers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    //@Autowired //instacier sans montrer les methodes de la classe d'iplementation et pour ne pas ecrire (private StudentService service = new StudentSreviceImpl(); )
    private StudentService service;

    //Pour l'injection des objets on a 2 façons: par autowired ou par constructeur(préferable)
    public StudentController(@Qualifier("service1") StudentService service) {
        this.service = service;
    }

    @PostMapping
    public Long save(StudentDTO dto){
        LOGGER.debug("start method save");
        return service.save(dto);
    }

    @PutMapping
    public Boolean update(StudentDTO dto){
        LOGGER.debug("start method update");
        return service.update(dto);
    }

    @DeleteMapping
    public Boolean delete(Long id){
        LOGGER.debug("start method delete");
        return service.deletById(id);
    }

    @GetMapping
    public List<StudentDTO> selectAll(){
        LOGGER.debug("start method selectAll");
        return service.slectAll();
    }
}
