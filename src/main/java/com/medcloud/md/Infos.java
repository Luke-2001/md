package com.medcloud.md;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "infos")
@Entity
@Getter
@Setter

public class Infos {
    @Id
    @Column(name = "nome")
    public String nome;
    @Column(name = "idade")
    public Integer idade;
    @Column(name = "somaDtNasc")
    public Integer somaDtNasc;

    @Column(name = "email")
    public String email;

    @Column(name = "endereco")
    public String endereco;

    @Column(name = "code")
    public Long code;
}
