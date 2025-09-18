// GerenciadorEventos

import java.util.ArrayList;
import java.util.Comparator;

public class GerenciadorEventos {
    private ArrayList<Evento> listaEventos;

    public GerenciadorEventos() {
        listaEventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento e) {
        listaEventos.add(e);
    }

    public void listarEventos() {
        if (listaEventos.isEmpty()) {
            System.out.println("Nenhum evento cadastrado.");
        } else {
            for (Evento e : listaEventos) {
                System.out.println(e);
            }
        }
    }

    public Evento buscarEventoPorTitulo(String titulo) {
        for (Evento e : listaEventos) {
            if (e.getTitulo().equalsIgnoreCase(titulo)) {
                return e;
            }
        }
        return null;
    }

    public Evento eventoMaisCheio() {
        return listaEventos.stream()
                .max(Comparator.comparingInt(Evento::totalInscritos))
                .orElse(null);
    }

    public void listarPorLotacao() {
        listaEventos.stream()
                .sorted(Comparator.comparingInt(Evento::totalInscritos).reversed())
                .forEach(System.out::println);
    }
}
