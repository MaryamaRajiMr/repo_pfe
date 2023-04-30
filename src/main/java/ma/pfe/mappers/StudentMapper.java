package ma.pfe.mappers;

import ma.pfe.dtos.StudentDTO;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")
public class StudentMapper {

    public StudentEntity convertToEntity(StudentDTO o){

        StudentEntity e= new StudentEntity();
        e.setName(o.getName());
        //e.setId(o.getId());
        return e;
    }

    public StudentDTO convertToDto(StudentEntity e){

        StudentDTO o=new StudentDTO();
        o.setName(e.getName());
        //o.setId(e.getId());
        return o;
    }

    public List<StudentEntity> convertToEntities(List<StudentDTO> dtos){

        return dtos.stream().map(dto -> convertToEntity(dto)).collect(Collectors.toList());
    }

    public List<StudentDTO> convertToDtos(List<StudentEntity> entities){

        //return entities.stream().map(entity -> convertToDto(entity)).collect(Collectors.toList());
        if(entities!=null&&!entities.isEmpty()){
            return entities.stream().map(entity -> convertToDto(entity)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }
}
