package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.12.2015.
 */

@Entity
@Table(name = "vaccinations")
public class vaccinations {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false)
    private String name; //название вакцины
    @Column(name = "start_age", nullable = false)
    private int startAge; //возраст начала
    @Column(name = "start_age_unit", nullable = false)
    @Enumerated(EnumType.STRING)
    private unitsEnum startAgeUnit; //единицы возраста
    @Column(name = "period", nullable = false)
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
    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<reseptionsVaccinations> reseptVaccin=new ArrayList<reseptionsVaccinations>();

    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<factsVaccination> factsVaccin=new ArrayList<factsVaccination>();

    @OneToMany(mappedBy = "vaccinationEntity",fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,orphanRemoval = true)
    private List<exclusion> exclusVaccin=new ArrayList<exclusion>();

}
