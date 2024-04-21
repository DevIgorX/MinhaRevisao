package br.com.SistemaAcademicom.Cadastros;

import java.util.ArrayList;

public class Cadastro {

    public ArrayList<Aluno> alunos = new ArrayList<>();

    public ArrayList<Professor> professors = new ArrayList<>();


    public void cadastrarAluno ( Aluno aluno){
        alunos.add(aluno);
    }

    public void cadastrarProfessor(Professor professor){
        professors.add(professor);
    }

    public void mostrarAlunos (){
        for( Aluno aluno : alunos ){
            System.out.println(aluno);
        }
    }

    public void mostrarProfessores(){
        for(Professor professor : professors){
            System.out.println(professor);
        }
    }


    public static void main(String[] args) {
        Aluno melhorAluno = new Aluno("Tauam Igor", "Tau95","Ads");
        Aluno joao = new Aluno("João Victor", "joao95", "ads");

        Professor claudinho = new Professor("Claudio Henrique","claudin95","Pisicologia");

        Cadastro cadastro = new Cadastro();

        cadastro.cadastrarAluno(joao);
        cadastro.cadastrarAluno(melhorAluno);

        cadastro.cadastrarProfessor(claudinho);

        cadastro.mostrarAlunos();
        cadastro.mostrarProfessores();
    }



}
