package br.edu.ifrn.sc.peoo.arquivos.gson;


public class Aluno {

    private String matricula;
    private String nome;
    private double rendimentoAcademico;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, double rendimentoAcademico) {
        this.matricula = matricula;
        this.nome = nome;
        this.rendimentoAcademico = rendimentoAcademico;
    }

    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendimentoAcademico() {
        return rendimentoAcademico;
    }

    public void setRendimentoAcademico(double rendimentoAcademico) {
        this.rendimentoAcademico = rendimentoAcademico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno{matricula=").append(matricula);
        sb.append(", nome=").append(nome);
        sb.append(", rendimentoAcademico=").append(rendimentoAcademico);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
