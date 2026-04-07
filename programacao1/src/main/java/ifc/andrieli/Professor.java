package ifc.andrieli;

import java.util.Date;

/*
 Feito por andri
 */
public class Professor {
    private String nivelEnsino;
    private String nomeCompleto;
    private int siape;
    private String email;
    private int telefoneContato;
    private String titulacaoAcademica;
    private String areaAtuacao;
    private String regimeTrabalho;
    private Date dataIngreso;
    private String formacao;
//////////////////////////////
    public Professor (){
    }
   
    public String getNivelEnsino (){
        return this.nivelEnsino;
    }
           
    public void setNivelEnsino (String _nivelEnsino){
        this.nivelEnsino = _nivelEnsino;
    }
   
    public String getNomeCompleto (){
        return this.nomeCompleto;
    }
           
    public void setNomeCompleto (String _nomeCompleto){
        this.nomeCompleto = _nomeCompleto;
    }
   
    public int getSiape (){
        return this.siape;
    }
           
    public void setNomeCompleto (int _siape){
        this.siape = _siape;
    }    
       
    public String getEmail (){
        return this.email;
    }
           
    public void setEmail (String _email){
        this.email = _email;
    }
   
    public int getTelefoneContato (){
        return this.telefoneContato;
    }
           
    public void setTelefoneContato (int _telefoneContato){
        this.telefoneContato = _telefoneContato;
    }    
       
    public String getTitulacaoAcademica (){
        return this.titulacaoAcademica;
    }
           
    public void setTitulacaoAcademica (String _titulacaoAcademica){
        this.titulacaoAcademica = _titulacaoAcademica;
    }
   
    public String getAreaAtuacao (){
        return this.areaAtuacao;
    }
           
    public void setAreaAtuacao (String _areaAtuacao){
        this.areaAtuacao = _areaAtuacao;
    }
   
    public String getRegimeTrabalho (){
        return this.regimeTrabalho;
    }
           
    public void setRegimeTrabalho (String _regimeTrabalho){
        this.regimeTrabalho = _regimeTrabalho;
    }
   
    public Date getDataIngresso (){
        return this.dataIngreso;
    }
           
    public void setDataIngresso (Date _dataIngreso){
        this.dataIngreso = _dataIngreso;
    }
   
    public String getFormacao (){
        return this.formacao;
    }
           
    public void setFormacao (String _formacao){
        this.formacao = _formacao;
    }
}