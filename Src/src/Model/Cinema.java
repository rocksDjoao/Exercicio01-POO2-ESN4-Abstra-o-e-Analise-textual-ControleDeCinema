package Model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {

    private String nome;
    private String endereco;
    private List<Sala> salas;
    private List<Filme> filmes;

    public Cinema() {
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public Cinema(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public Cinema(String nome, String endereco, List<Sala> salas, List<Filme> filmes) {
        this.nome = nome;
        this.endereco = endereco;
        this.salas = salas;
        this.filmes = filmes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public void adicionarSala(Sala sala) {
        this.salas.add(sala);
    }

    public void adicionarFilme(Filme filme) {
        this.filmes.add(filme);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", salas=" + salas.size() +
                ", filmes=" + filmes.size() +
                '}';
    }
}
