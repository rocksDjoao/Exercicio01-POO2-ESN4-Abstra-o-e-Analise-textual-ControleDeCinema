package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {

    private Filme filme;
    private Sala sala;
    private LocalDateTime horario;
    private boolean encerrada;
    private List<Ingresso> ingressos;

    public Sessao() {
        this.ingressos = new ArrayList<>();
    }

    public Sessao(Filme filme, Sala sala, LocalDateTime horario, boolean encerrada) {
        this.filme = filme;
        this.sala = sala;
        this.horario = horario;
        this.encerrada = encerrada;
        this.ingressos = new ArrayList<>();
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public boolean isEncerrada() {
        return encerrada;
    }

    public void setEncerrada(boolean encerrada) {
        this.encerrada = encerrada;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    /**
     * Número máximo de ingressos disponíveis para a sessão, determinado
     * pela capacidade da sala em que ela ocorre.
     */
    public int getLimiteIngressos() {
        return sala != null ? sala.getCapacidade() : 0;
    }

    /**
     * Verifica se ainda há ingressos disponíveis para a sessão.
     */
    public boolean isIngressoDisponivel() {
        return !encerrada && ingressos.size() < getLimiteIngressos();
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "filme=" + (filme != null ? filme.getTitulo() : null) +
                ", sala=" + (sala != null ? sala.getNumero() : null) +
                ", horario=" + horario +
                ", encerrada=" + encerrada +
                ", ingressosVendidos=" + ingressos.size() +
                '}';
    }
}
