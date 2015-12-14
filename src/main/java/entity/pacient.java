package entity;

/**
 * Created by User on 11.12.2015.
 */

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pacient")
//@NamedQuery(name = "entity.pacient.getAll", query = "SELECT c from entity.pacient c")
public class pacient {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "surname", nullable = false)
    private String surname;    //Фамилия пациента
    @Column(name = "name", nullable = false)
    private String name;      //Имя пациента
    @Column(name = "patronymic", nullable = false)
    private String patronymic; //Отчетство пациента
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "birthday", nullable = false)
    private Date birthday; //дата рождения
    @Column(name = "gender", nullable = false)
    @Enumerated(EnumType.STRING)
    private genderEnum gender;
    @Column(name = "address", nullable = false)
    private String address; //адрес
    @Column(name = "phone")
    private String phone; //телефон
    @Column(name = "e_mail")
    private String eMail; //e-mail
    @Column(name = "strah_polis", nullable = false)
    private String strahPolis; //страховой полис
    //private long comforTime; //ссылка на комфортное время

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<exclusion> exclusPatient=new ArrayList<exclusion>();

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<factsVaccination> factsPatient=new ArrayList<factsVaccination>();

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<reseptions> reseptPacient=new ArrayList<reseptions>();

    @OneToMany(mappedBy = "pacientEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<records> recordPacient=new ArrayList<records>();

}
