package org.generation.brazil.gfood.cliente;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@Entity
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    private String endereco;

    @NotNull
    @Column(name = "nascimento")
    private Date nascimento;

}
