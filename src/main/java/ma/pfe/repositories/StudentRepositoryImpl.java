package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component //Component pour instancier la classe au demarage de lapplication(appliaction context)
@Repository("repo1") // pour qualifié quel class d'impl on appel dans le service dans le cas de plusieur repos
public class StudentRepositoryImpl implements StudentRepository{

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentRepositoryImpl.class);

    public StudentRepositoryImpl() {
        System.out.println("Instanciation StudentRepositoryImpl ");
    }

    @Override
    public Long save(StudentEntity e) {return null;}

    @Override
    public Boolean update(StudentEntity e) {
        LOGGER.debug("start method update");
        return null;
    }

    @Override
    public Boolean deletById(Long id) {
        LOGGER.debug("start method deletById");
        return null;
    }

    @Override
    public List<StudentEntity> slectAll() {
        LOGGER.debug("start method selectAll");
        return null;
    }


}
