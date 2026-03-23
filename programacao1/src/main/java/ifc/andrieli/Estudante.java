/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.andrieli;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Estudante {

    private String nomeCompleto;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String enderecoEletronico;
    private double telefoneContato;
    private int anoIngresso;
    private int semestreIngresso;
    private String situacaoAcademica;
    private String ensinoMedioIntegrado;
    private String matricula;
    private String email;
    private String graduacao;
    private String posGraduacao;
    

    public Estudante() {
        this.nomeCompleto = "Nobody";
    }

    // GERAR MATRÍCULA (ano + semestre + 5 dígitos)
    public void gerarMatricula() {
        this.matricula = anoIngresso + "" + semestreIngresso;
    }

// GETTERS E SETTERS
    public String getNome() {
        return this.nomeCompleto;
    }

    public void setNome(String nome) {
        this.nomeCompleto = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    public int getSemestreIngresso() {
        return semestreIngresso;
    }

    public void setSemestreIngresso(int semestreIngresso) {
        this.semestreIngresso = semestreIngresso;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getSituacaoAcademica() {
        return situacaoAcademica;
    }

    public void setSituacaoAcademica(String situacaoAcademica) {
        this.situacaoAcademica = situacaoAcademica;
    }
   }



