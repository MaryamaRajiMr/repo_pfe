package ma.pfe.services;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
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



    public StudentSreviceImpl() {
        System.out.println("Instanciation StudentSreviceImpl ");
    }

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("start method save");
        StudentEntity e=mapper.convertToEntity(dto);
        return repository.save(e);
    }

    @Override
    public Boolean update(StudentDTO dto) {
        LOGGER.debug("start method update");
        StudentEntity e=mapper.convertToEntity(dto);
        return repository.update(e);
    }

    @Override
    public Boolean deletById(Long id) {
        LOGGER.debug("start method deletById");
        return repository.deletById(id);
    }

    @Override
    public List<StudentDTO> slectAll() {
        LOGGER.debug("start method selectAll");
        List<StudentEntity> l=repository.slectAll();
        List<StudentDTO> ld=mapper.convertToDtos(l);
        return ld;
    }

}
