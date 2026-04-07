package ifc.andrieli;

import java.util.HashSet;
import java.util.Set;

/*
    Feito por andri
 */
public class Turma {
    private String nome;
    private String ano;
    private String curso;
    
    private Set<Estudante> discentes = new HashSet<Estudante>();
    Set<Disciplina> discipina = new HashSet<Disciplina>();
    Turma professor = new Turma();
    ///////////////////
    public Turma(){
    }
   
    public String getNome (){
        return this.nome;
    }
           
    public void setNome (String _nome){
        this.nome = _nome;
    }
   
    public String getAno (){
    return this.ano;
    }
           
    public void setAno (String _ano){
        this.ano = _ano;    
    }
   
    public String getCurso (){
        return this.curso;
    }
           
    public void setCurso (String _curso){
        this.curso = _curso;
    }
}

