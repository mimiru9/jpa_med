package entity;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by User on 11.12.2015.
 */
@Entity
@Table(name= "doctors")
public class doctors {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "suranme")
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
    private String e_mail; //e-mail
    //private long timetable; //ссылка на расписание
    @Column(name = "speciality")
    private String speciality; //специальность
    @Column(name = "category")
    private String category; //категория

}
