package ma.pfe.services;
//Il faut utiliser dto et no entity pour ne pas exposer la stucture db

import ma.pfe.dtos.StudentDTO;

import java.util.List;

public interface StudentService {

    Long save(StudentDTO dto);
    long update(StudentDTO dto);
    Boolean deletById(Long id);
    List<StudentDTO> slectAll();
}
