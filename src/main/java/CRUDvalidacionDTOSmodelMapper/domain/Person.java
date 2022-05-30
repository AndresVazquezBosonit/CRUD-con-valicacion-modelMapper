package CRUDvalidacionDTOSmodelMapper.domain;

import lombok.Data;

import javax.persistence.*;

import java.util.Date;

@Entity
@Data
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id_person;

    @Column(name = "usuario")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "company_email")
    private String company_email;

    @Column(name = "personal_email")
    private String personal_email;

    @Column(name = "city")
    private String city;

    @Column(name = "active")
    private Boolean active = true;

    @Column(name = "created_date")
   // @Temporal(TemporalType.TIMESTAMP)
    private Date created_date;

    private String image_url;

    private Date termination_date;
}
