package ma.pfe.dtos;//models
//Represente le formulaire(View)
//1 DTO(Data Transfer Object) pour chaque client

public class StudentDTO {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
