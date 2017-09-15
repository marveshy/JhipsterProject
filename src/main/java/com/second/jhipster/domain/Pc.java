package com.second.jhipster.domain;

import com.second.jhipster.config.Constants;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table("Pc_table")
public class Pc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idPc;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(length = 50)
    private String label;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="date_achat" nullable = false)
    private Date dateAchat;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="operations_system" nullable = false)
    private String operationsSystem;
    private static final long serialVersionUID = 1L;



}
