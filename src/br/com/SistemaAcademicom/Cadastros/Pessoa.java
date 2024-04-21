package br.com.SistemaAcademicom.Cadastros;

public class Pessoa {
    private String nome;
    private  String senha;

    private String curso;


    Pessoa(String nome,String senha,String curso ){
        this.nome = nome;
        this.senha = senha;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
