package entity;//package entity;

import javax.persistence.*;

/**
 * Created by User on 11.12.2015.
 */

@Entity
@Table(name = "vaccinations")
public class vaccinations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name; //название вакцины

    @Column(name = "start_age")
    private int startAge; //возраст начала
    @Column(name = "start_age_unit")
    @Enumerated(EnumType.STRING)
    private unitsEnum startAgeUnit; //единицы возраста
    @Column(name = "period")
    private boolean period; //периодичность
    @Column(name = "interval")
    private int interval; //интервал
    @Column(name = "interval_unit")
    @Enumerated(EnumType.STRING)
    private unitsEnum intervalUnit;
    @Column(name = "end_age")
    private int endAge; //возраст конца
    @Column(name = "end_age_unit")
    @Enumerated(EnumType.STRING)
    private unitsEnum endAgeUnit;
    @OneToMany
    private reseptionsVaccinations id_vaccin_res;

}
