package entity;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by User on 11.12.2015.
 */

@Entity
@Table(name = "facts_vaccination")
public class factsVaccination {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date")
    private Date date; //Дата вакцинации

    @ManyToOne
    private pacient id_pacient; //ссылка на пациента

    @ManyToOne
    private vaccinations id_vaccination; //ссылка на вакцину

}
