// Evento

import java.util.ArrayList;

public class Evento {
    private String titulo;
    private String tipo; // palestra, oficina ou show
    private String data;
    private int capacidade;
    private ArrayList<Participante> inscritos;

    public Evento(String titulo, String tipo, String data, int capacidade) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.data = data;
        this.capacidade = capacidade;
        this.inscritos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getData() {
        return data;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean inscrever(Participante p) {
        if (inscritos.size() < capacidade) {
            inscritos.add(p);
            return true;
        } else {
            return false;
        }
    }

    public int vagasRestantes() {
        return capacidade - inscritos.size();
    }

    public int totalInscritos() {
        return inscritos.size();
    }
}
