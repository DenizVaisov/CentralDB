package models;

import javax.persistence.*;
import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "nomenclature")
public class Nomenclature {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nomenclatureGenerator")
    @SequenceGenerator(name = "nomenclatureGenerator", sequenceName = "nomenclature_seq", allocationSize = 1)
    private Long id;

    @Column
    private UUID uid;

    @Column
    private String nameOfProduct;

    @Column
    private String unitCode;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUid() {
        return uid;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }
}
