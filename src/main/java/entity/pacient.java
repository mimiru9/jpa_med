package entity;//package entity;

/**
 * Created by User on 11.12.2015.
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "pacient")
//@NamedQuery(name = "entity.pacient.getAll", query = "SELECT c from entity.pacient c")
public class pacient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "surname")
    private String surname;    //Фамилия пациента
    @Column(name = "name")
    private String name;      //Имя пациента
    @Column(name = "patronymic")
    private String patronymic; //Отчетство пациента
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "birthday")
    private Date birthday; //дата рождения
    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private genderEnum gender;
    @Column(name = "address")
    private String address; //адрес
    @Column(name = "phone")
    private String phone; //телефон
    @Column(name = "e_mail")
    private String eMail; //e-mail
    @Column(name = "strah_polis")
    private String strahPolis; //страховой полис
    //private long comforTime; //ссылка на комфортное время

}
