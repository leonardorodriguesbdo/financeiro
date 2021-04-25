package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ManagedBean
@javax.faces.bean.ViewScoped
public class PessoaBean {
    private String nome;
    private String sobrenome;
    private String nomeCompleto;

    public void dizerOla() {
        this.nomeCompleto = this.nome.toUpperCase() + " " + this.sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
