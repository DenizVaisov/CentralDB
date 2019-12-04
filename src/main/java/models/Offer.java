package models;

import javax.persistence.*;
import java.rmi.server.UID;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "offer")
public class Offer {
    // Первичный ключ, называть строго как в таблице
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offerGenerator")
    @SequenceGenerator(name = "offerGenerator", sequenceName = "offer_seq", allocationSize = 1)
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

    public Date getDateOfExplonation() {
        return dateOfExplonation;
    }

    public void setDateOfExplonation(Date dateOfExplonation) {
        this.dateOfExplonation = dateOfExplonation;
    }

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

    public Nomenclature getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(Nomenclature nomenclature) {
        this.nomenclature = nomenclature;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Float getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(Float priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public Float getCountOfProduct() {
        return countOfProduct;
    }

    public void setCountOfProduct(Float countOfProduct) {
        this.countOfProduct = countOfProduct;
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
}