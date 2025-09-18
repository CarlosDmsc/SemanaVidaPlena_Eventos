// GerenciadorEventos

import java.util.ArrayList;

public class GerenciadorEventos {
    private ArrayList<Evento> listaEventos;

    public GerenciadorEventos() {
        listaEventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento e) {
        listaEventos.add(e);
    }

    public void listarEventos() {
        for (Evento e : listaEventos) {
            System.out.println("Título: " + e.getTitulo() + " | Tipo: " + e.getTipo()
                    + " | Data: " + e.getData() + " | Vagas: " + e.vagasRestantes());
        }
    }

    public Evento eventoMaisCheio() {
        Evento maisCheio = null;
        int maior = -1;
        for (Evento e : listaEventos) {
            if (e.totalInscritos() > maior) {
                maior = e.totalInscritos();
                maisCheio = e;
            }
        }
        return maisCheio;
    }
}
