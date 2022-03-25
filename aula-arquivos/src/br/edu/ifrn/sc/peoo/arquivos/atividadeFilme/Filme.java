package br.edu.ifrn.sc.peoo.arquivos.atividadeFilme;

public class Filme {

    private String titulo;
    private String descricao;
    private double imdbRating;
    private int minutosDuracao;

    public Filme() {
    }

    public Filme(String titulo, String descricao, double imdbRating, int minutosDuracao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.imdbRating = imdbRating;
        this.minutosDuracao = minutosDuracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public int getMinutosDuracao() {
        return minutosDuracao;
    }

    public void setMinutosDuracao(int minutosDuracao) {
        this.minutosDuracao = minutosDuracao;
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", descricao=" + descricao + ", imdbRating=" + imdbRating + ", minutosDuracao=" + minutosDuracao + '}';
    }

}
