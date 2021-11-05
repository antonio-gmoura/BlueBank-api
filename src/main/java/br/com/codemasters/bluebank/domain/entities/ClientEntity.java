package br.com.codemasters.bluebank.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Data
@Builder
@NoArgsConstructor
public class ClientEntity extends BaseEntityModel {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "adress", nullable = false)
    private String adress;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "rg", nullable = false)
    private String rg;

    @Column(name = "sex", nullable = false)
    private String sex;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "telephoneNumber", nullable = false)
    private String telephoneNumber;

    public ClientEntity(String name, String adress, String cpf, String rg, String sex, String email, String telephoneNumber){
        this.name = name;
        this.adress = adress;
        this.cpf = cpf;
        this. rg = rg;
        this.sex = sex;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
    }
}
