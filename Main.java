// Main

public class Main {
    public static void main(String[] args) {
        GerenciadorEventos g = new GerenciadorEventos();

        Evento e1 = new Evento("Saúde Mental", "Palestra", "20/09/2024", 50);
        Evento e2 = new Evento("Oficina de Yoga", "Oficina", "21/09/2024", 30);

        g.adicionarEvento(e1);
        g.adicionarEvento(e2);

        Participante p1 = new Participante("Carlos", "carlos@email.com");
        Participante p2 = new Participante("Ana", "ana@email.com");

        e1.inscrever(p1);
        e1.inscrever(p2);
        e2.inscrever(p1);

        g.listarEventos();

        Evento maisCheio = g.eventoMaisCheio();
        System.out.println("Evento mais cheio: " + maisCheio.getTitulo());
    }
}
