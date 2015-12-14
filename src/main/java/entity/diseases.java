package entity;

import javax.persistence.*;

/**
 * Created by User on 14.12.2015.
 */
@Entity
@Table(name = "dieseases")
public class diseases {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "code")
    private String code;

    @Column(name = "nosology")
    private  String nosology;

}
