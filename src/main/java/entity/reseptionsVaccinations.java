package entity;//package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 11.12.2015.
 */
@Entity
@Table(name = "reseptions_vaccinations")
public class reseptionsVaccinations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date_in")
    private Date dateIn; //дата приема

    @Column(name = "count")
    private int count; //количество (мл)

    @Column(name = "expiration_date")
    private Date expirationDate; //срок годности

    @Column(name = "seria")
    private String seria; //серия

    @Column(name = "manufacturer")
    private String manufacturer; //производитель

}
