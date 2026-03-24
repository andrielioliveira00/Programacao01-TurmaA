
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifc.andrieli;

import java.util.HashSet;
import java.util.Set;

public class Turma {

private String Nnome;

// "Responsável" pela turma (igual ao líder no exemplo)
private Professor ProfessorResponsavel;

// Conjuntos (igual ao HashSet do quadro)
private Set<Estudante> estudantes;
private Set<Disciplina> disciplinas;
private Set<Professor> professores;

// Construtor
public Turma(String nome) {
this.nome = nome;
this.estudantes = new HashSet<>(); // size = 0
this.disciplinas = new HashSet<>(); // size = 0
this.professores = new HashSet<>(); // size = 0
}

// Associações
public void setProfessorResponsavel(Professor p) {
this.   ProfessorResponsavel = p;
}

public void adicionarDiscente(Estudante d) {
Estudante.dd(d);
}

public void adicionarDisciplina(Disciplina d) {
disciplinas.add(d);
}

public void adicionarProfessor(Professor p) {
professores.add(p);

}
}