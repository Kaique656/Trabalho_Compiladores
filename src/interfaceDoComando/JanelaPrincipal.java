package interfaceDoComando;

import javax.swing.*;

/**
 * RESPONSÁVEL: Kaique
 *
 * Janela principal da interface do compilador.
 * Aqui só se monta o layout e se "pluga" as ações -- a lógica de cada
 * ação mora nas classes específicas (Editor, AreaMenssagem, BarraStatus,
 * AcoesArquivo, AcoesEdicao, AcoesCompilador).
 */
public class JanelaPrincipal {

    private JFrame janela;
    private JPanel painel;

    // classes dos componentes (feitas pela Amanda e pelo Kaique)
    private Editor editor;
    private AreaMenssagem areaMensagem;
    private BarraStatus barraStatus;

    public JanelaPrincipal() {

        // Janela principal
        janela = new JFrame("Interface do Comando");
        janela.setSize(1500, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false); // item 1: tamanho fixo, mas pode minimizar/fechar

        // Painel principal
        painel = new JPanel();
        painel.setLayout(null);
        janela.add(painel);

        // Instancia os componentes prontos (não recriar JTextArea aqui!)
        editor = new Editor();
        areaMensagem = new AreaMenssagem();
        barraStatus = new BarraStatus();

        // Botões da esquerda (toolbar)
        adicionarBotoes();

        // Editor + mensagens divididos por uma barra arrastável (item 3)
        JSplitPane splitPane = new JSplitPane(
                JSplitPane.VERTICAL_SPLIT,
                editor.getComponente(),
                areaMensagem.getComponente()
        );
        splitPane.setBounds(180, 10, 1300, 730); // ajustar conforme necessário
        splitPane.setDividerLocation(550);
        painel.add(splitPane);

        // Barra de status embaixo (item 8)
        JPanel statusComponente = barraStatus.getComponente();
        statusComponente.setBounds(180, 745, 1300, 25); // largura máxima visível
        painel.add(statusComponente);

        janela.setVisible(true);
    }

    public void adicionarBotoes() {

        Botoes b = new Botoes();

        JButton novo = b.novo();
        novo.setBounds(10, 10, 150, 50);

        JButton abrir = b.abrir();
        abrir.setBounds(10, 70, 150, 50);

        JButton salvar = b.salvar();
        salvar.setBounds(10, 130, 150, 50);

        JButton copiar = b.copiar();
        copiar.setBounds(10, 190, 150, 50);

        JButton colar = b.colar();
        colar.setBounds(10, 250, 150, 50);

        JButton recortar = b.recortar();
        recortar.setBounds(10, 310, 150, 50);

        JButton compilar = b.compilar();
        compilar.setBounds(10, 370, 150, 50);

        JButton equipe = b.equipe();
        equipe.setBounds(10, 430, 150, 50);

        // ---- Ações (Gustavo) ----
        // Instancia as classes de ação passando os componentes que elas precisam mexer
        AcoesArquivo acoesArquivo = new AcoesArquivo(editor, areaMensagem, barraStatus);
        AcoesEdicao acoesEdicao = new AcoesEdicao(editor);
        AcoesCompilador acoesCompilador = new AcoesCompilador(areaMensagem);

        // Cada botão só chama o método da classe responsável -- a JanelaPrincipal
        // não decide o que a ação faz, só aciona.
        novo.addActionListener(e -> acoesArquivo.novo());
        abrir.addActionListener(e -> acoesArquivo.abrir());
        salvar.addActionListener(e -> acoesArquivo.salvar());
        copiar.addActionListener(e -> acoesEdicao.copiar());
        colar.addActionListener(e -> acoesEdicao.colar());
        recortar.addActionListener(e -> acoesEdicao.recortar());
        compilar.addActionListener(e -> acoesCompilador.compilar());
        equipe.addActionListener(e -> acoesCompilador.equipe());

        painel.add(novo);
        painel.add(abrir);
        painel.add(salvar);
        painel.add(copiar);
        painel.add(colar);
        painel.add(recortar);
        painel.add(compilar);
        painel.add(equipe);

        // TODO (Kaique): adicionar ícone em cada botão (item 9 exige
        // ícone + nome completo + atalho). Ex: novo.setIcon(new ImageIcon("caminho/icone.png"));

        // TODO (Gustavo): configurar os atalhos de teclado globais (ctrl-n, ctrl-o,
        // ctrl-s, ctrl-c, ctrl-v, ctrl-x, F7, F1) via InputMap/ActionMap, já que
        // Swing puro não tem "accelerator" fora de menu.
    }

    public static void main(String[] args) {
        new JanelaPrincipal();
    }
}