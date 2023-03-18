package ma.pfe.repositories;
//Il faut utiliser la table et no dto

import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {

    Long save(StudentEntity e);
    Boolean update(StudentEntity e);
    Boolean deletById(Long id);
    List<StudentEntity> slectAll();
}
