package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by User on 14.12.2015.
 */
@Entity
@Table(name = "reseptions")
public class reseptions {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_view", nullable = false)
    private Date dateView; //дата осмотра

    @Column(name = "form_view")
    @Enumerated(EnumType.STRING)
    private formViewEnum formView; //форма осмотра
    @Column(name = "sentEnum")
    @Enumerated(EnumType.STRING)
    private sentEnum sent; //направление

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private pacient pacientEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private doctors doctorEntity;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "reseption_disease",
            joinColumns = {@JoinColumn(name = "reseption_id")},
            inverseJoinColumns = {@JoinColumn(name = "disease_id")})
    private List<diseases> diseasesResept=new ArrayList<diseases>();

}
