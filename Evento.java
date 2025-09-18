// Evento

import java.util.ArrayList;

public class Evento {
    private String titulo;
    private String tipo; // Palestra, Oficina ou Show
    private String data;
    private int capacidade;
    private ArrayList<Participante> inscritos;

    public Evento(String titulo, String tipo, String data, int capacidade) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.data = data;
        this.capacidade = capacidade > 0 ? capacidade : 1;
        this.inscritos = new ArrayList<>();
    }

    public String getTitulo() { return titulo; }
    public String getTipo() { return tipo; }
    public String getData() { return data; }
    public int getCapacidade() { return capacidade; }
    public int vagasRestantes() { return capacidade - inscritos.size(); }
    public int totalInscritos() { return inscritos.size(); }

    public boolean inscrever(Participante p) {
        if (inscritos.contains(p)) return false; // já inscrito
        if (inscritos.size() < capacidade) {
            inscritos.add(p);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Tipo: " + tipo +
               " | Data: " + data + " | Vagas: " + vagasRestantes() +
               "/" + capacidade;
    }
}
