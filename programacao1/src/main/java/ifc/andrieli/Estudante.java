package ifc.andrieli;
/*
Feio por andri.
*/
import java.util.Date;

public class Estudante {
    private String nome;
    private Date dataNascimento;
    private String cpf;
    private char genero;
    private String matricula;
    private String email;
    private String telefone;
    private int anoIngresso;
///////////////////////////////////
    public Estudante(){        
       
    }
       
    public int obterIdade(Date hoje) {
    int idade = 0;
    return idade;
    }
    public String getNome (){
        return this.nome;
    }
           
    public void setNome (String _nome){
        this.nome = _nome;
    }
           
    public Date getDate (){
        return this.dataNascimento;
    }
           
    public void setDate (Date _dataNascimento){
        this.dataNascimento = _dataNascimento;
    }
   
    public String getCpf (){
        return this.cpf;
    }
           
    public void setCpf (String _cpf){
        this.cpf = _cpf;
    }
   
    public char getGenero (){
        return this.genero;
    }
           
    public void setGenero (char _genero){
        this.genero = _genero;
    }
   
    public String getMatricula (){
        return this.matricula;
    }
           
    public void setMatricula (String _matricula){
        this.matricula = _matricula;
    }
       
    public String getEmail (){
        return this.email;
    }
           
    public void setEmail (String _email){
        this.email = _email;
    }
   
    public String getTelefone (){
        return this.telefone;
    }
           
    public void setTelefone (String _telefone){
        this.telefone = _telefone;
    }    
       
    public int getAnoIngresso (){
    return this.anoIngresso;
    }
           
    public void setAnoIngresso (int _anoIngreso){
        this.anoIngresso = _anoIngreso;    
    }
}
