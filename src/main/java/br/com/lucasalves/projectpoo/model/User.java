package br.com.lucasalves.projectpoo.model;

import jakarta.persistence.Id;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;



@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String nome;
    private String procedimento;
    private Date dia;
    
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProcedimento() {
        return procedimento;
    }
    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }
    public Date getDia() {
        return dia;
    }
    public void setDia(Date dia) {
        this.dia = dia;
    }
 
}
