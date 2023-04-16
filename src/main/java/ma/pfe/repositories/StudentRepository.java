package ma.pfe.repositories;
//Il faut utiliser la table et no dto

import ma.pfe.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repo1")
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

   // StudentEntity save(StudentEntity e);
   // Boolean update(StudentEntity e);
   // Boolean deletById(Long id);
    //List<StudentEntity> slectAll();
}
