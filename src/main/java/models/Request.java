package models;

import javax.persistence.*;
import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "requestGenerator")
    @SequenceGenerator(name = "requestGenerator", sequenceName = "request_seq", allocationSize = 1)
    private Long id;
    private UUID uid;

    @ManyToOne
    private Nomenclature nomenclature;

    @ManyToOne
    private Organization organization;

    // Поля, называть строго как в таблице
    private Float priceOfProduct;
    private Float countOfProduct;

    private String unitCode;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    @Temporal(TemporalType.DATE)
    private Date dateOfExplonation;

    private Boolean status;
}
