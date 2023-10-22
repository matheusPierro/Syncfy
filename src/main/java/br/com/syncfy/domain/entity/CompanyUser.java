package br.com.syncfy.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COMPANY_USER")
public class CompanyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ID")
    @SequenceGenerator(name = "SQ_ID", sequenceName = "SQ_ID")
    @Column(name = "ID")
    private Long id;

    @Column(name = "CNPJ", nullable = false)
    private String cnpj;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "STATUS", nullable = false)
    private boolean status;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    private Phone phone;

    private Address address;
}