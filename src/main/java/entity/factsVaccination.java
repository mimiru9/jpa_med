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
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date", nullable = false)
    private Date date; //Дата вакцинации

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vaccination_id", referencedColumnName = "id")
    private vaccinations vaccinationEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private pacient pacientEntity;

}
