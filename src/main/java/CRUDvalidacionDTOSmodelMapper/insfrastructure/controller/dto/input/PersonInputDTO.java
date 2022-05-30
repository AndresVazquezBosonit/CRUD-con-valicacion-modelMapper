package CRUDvalidacionDTOSmodelMapper.insfrastructure.controller.dto.input;

import lombok.Data;

import java.util.Date;

@Data
public class PersonInputDTO {
    private int id_person;
    private String username;
    private String password;
    private String name;
    private String surname;
    private String company_email;
    private String personal_email;
    private String city;
    private Boolean active;
    private String image_url;
    private Date created_date;
}
