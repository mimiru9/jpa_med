package entity;

import entity.diseases;
import entity.doctors;
import entity.pacient;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by User on 14.12.2015.
 */
@Entity
@Table(name = "reseptions")
public class reseptions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_view")
    private Date dateView; //дата осмотра

    @Column(name = "form_view")
    @Enumerated(EnumType.STRING)
    private formViewEnum formView; //форма осмотра
    @Column(name = "sent")
    @Enumerated(EnumType.STRING)
    private sent sent; //направление

    @ManyToMany
    private diseases id_diseases;

    @ManyToOne
    private pacient id_pacient;

    @ManyToOne
    private doctors id_doctor;

}
