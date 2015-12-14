package entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Admin on 14.12.2015.
 */
@Entity
@Table(name = "records")
public class records {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "date_time", nullable = false)
    private Date dateTime;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private statusRecordEnum status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pacient_id", referencedColumnName = "id")
    private pacient pacientEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doctor_id", referencedColumnName = "id")
    private doctors doctorEntity;
}
