package entity;

import javax.persistence.*;

/**
 * Created by User on 14.12.2015.
 */
@Entity
@Table(name = "dieseases")
public class diseases {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "nosology", nullable = false)
    private  String nosology;

}
