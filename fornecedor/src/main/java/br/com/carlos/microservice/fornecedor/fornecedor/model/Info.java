package br.com.carlos.microservice.fornecedor.fornecedor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Info {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String estado;
    private String nome;
    private String cidade;
}
