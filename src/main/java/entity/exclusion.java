package entity;//package entity;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by User on 11.12.2015.
 */

@Entity
@Table(name = "exclusion")
public class exclusion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="view_ex")
    private String viewEx;

    @ManyToOne
    private pacient id_pacient; //ссылка на пациента

    @ManyToOne
    private vaccinations id_vaccination; //ссылка на вакцину

}
