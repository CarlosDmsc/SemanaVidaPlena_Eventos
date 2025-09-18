# SemanaVidaPlena_Eventos
Projeto fictício de programação orientada à objetos.


## Equipe
- Carlos Roberto - 00000853313
- Bruno Cavalcanti - 00000853197


## Requisitos Iniciais
- Linguagem: Java
- Encapsulamento de classes e uso de getters/setters.
- Pelo menos 6 métodos para consultas estratégicas.

## 📜 Descrição
Aplicação em **Java** para gerenciar os **eventos da Semana Vida Plena**, um festival de saúde, cultura e bem-estar.  
O sistema permite cadastrar eventos (palestras, oficinas e shows), participantes e controlar inscrições, além de gerar consultas simples para apoiar decisões da organização.

### Funcionalidades
- **Cadastro de eventos**: título, tipo (palestra, oficina ou show), data e capacidade máxima.
- **Cadastro de participantes**: nome e e-mail.
- **Inscrição em eventos**: controle de vagas e registro de presença.
- **Relatórios estratégicos** (exemplos implementados/planejados):
  - Evento mais cheio.
  - Quantidade de vagas restantes por evento.
  - Possibilidade de expandir para taxa de lotação, eventos que lotam mais rápido etc.

## Compilação E Execução
Compilação - javac src/*.java

Execução - java -cp src Main

## Detalhes Do Código

- **Encapsulamento**: todos os atributos são private com métodos de acesso (get) para proteger os dados.

- **Coleções**: uso de ArrayList para armazenar eventos e participantes.

- **Polimorfismo e herança:** o sistema já permite futura extensão criando subclasses de Evento (ex.: Palestra, Show) sem alterar o código que gerencia a lista.

- **GerenciadorEventos** concentra as operações de consulta (ex.: evento mais cheio).
