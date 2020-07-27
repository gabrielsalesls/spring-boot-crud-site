package com.project.springCrud.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private long id;

//
//    @Version
//    @Getter @Setter
//    private Integer version;


    @Getter @Setter
    @NotBlank
    private String produtoId;

    @Getter @Setter
    @NotBlank
    private String nome;

    @Getter @Setter
    @NotNull
    private BigDecimal preco;

}
