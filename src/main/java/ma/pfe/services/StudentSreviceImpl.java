package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentSreviceImpl implements StudentService{

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentSreviceImpl.class);

    @Autowired //(injection de dépendance) prend lobjet deja cree et l affecte a cette variable pour ne pas instancier plusieur fois
    @Qualifier("repo1") // pour definire le repo qu'on a appele
    private StudentRepository repository;
    @Autowired
    @Qualifier("mapper1")
    private StudentMapper mapper;

//    public StudentSreviceImpl() {
//        System.out.println("Instanciation StudentSreviceImpl ");
//    }

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("start method save");
        StudentDTO rep = mapper.convertToDto(repository.save(mapper.convertToEntity(dto)));
        return rep.getId();
    }

    @Override
    public long update(StudentDTO dto) {
        LOGGER.debug("start method update");
        StudentDTO rep = mapper.convertToDto(repository.save(mapper.convertToEntity(dto)));
        return rep.getId();
    }

    @Override
    public Boolean deletById(Long id) {
        LOGGER.debug("start method deletById");
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<StudentDTO> slectAll() {
        LOGGER.debug("start method selectAll");
        return mapper.convertToDtos(repository.findAll());
    }

}
