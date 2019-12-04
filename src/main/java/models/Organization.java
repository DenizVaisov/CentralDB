package models;

import javax.persistence.*;
import java.rmi.server.UID;
import java.util.UUID;

@Entity
@Table(name = "organization")
public class Organization {
    // Первичный ключ, называть строго как в таблице
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "organizationGenerator")
    @SequenceGenerator(name = "organizationGenerator", sequenceName = "organization_seq", allocationSize = 1)
    private Long id;

    private UUID uid;

    // Поля, называть строго как в таблице
    @Column
    private String nameOfOrg;
    @Column
    private String adressOfOrg;
    @Column
    private Float numberOfOrg;
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

    public String getNameOfOrg() {
        return nameOfOrg;
    }

    public void setNameOfOrg(String nameOfOrg) {
        this.nameOfOrg = nameOfOrg;
    }

    public String getAdressOfOrg() {
        return adressOfOrg;
    }

    public void setAdressOfOrg(String adressOfOrg) {
        this.adressOfOrg = adressOfOrg;
    }

    public Float getNumberOfOrg() {
        return numberOfOrg;
    }

    public void setNumberOfOrg(Float numberOfOrg) {
        this.numberOfOrg = numberOfOrg;
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
