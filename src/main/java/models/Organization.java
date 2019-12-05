package models;

import javax.persistence.*;
import java.rmi.server.UID;
import java.util.UUID;

@Entity
@Table(name = "organization")
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organizationGenerator")
    @SequenceGenerator(name = "organizationGenerator", sequenceName = "organization_seq", allocationSize = 1)
    private Long id;

    @Column
    private UUID uid;

    @Column
    private String nameOfOrganization;

    @Column
    private String adressOfOrganization;

    @Column
    private Float numberOfOrganization;

    @Column
    private String inn;

    @Column
    private String kpp;

    @Column
    private String ogrn;

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

    public String getNameOfOrganization() {
        return nameOfOrganization;
    }

    public void setNameOfOrganization(String nameOfOrganization) {
        this.nameOfOrganization = nameOfOrganization;
    }

    public String getAdressOfOrganization() {
        return adressOfOrganization;
    }

    public void setAdressOfOrganization(String adressOfOrganization) {
        this.adressOfOrganization = adressOfOrganization;
    }

    public Float getNumberOfOrganization() {
        return numberOfOrganization;
    }

    public void setNumberOfOrganization(Float numberOfOrganization) {
        this.numberOfOrganization = numberOfOrganization;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getOgrn() {
        return ogrn;
    }

    public void setOgrn(String ogrn) {
        this.ogrn = ogrn;
    }
}
