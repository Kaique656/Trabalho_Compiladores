package interfaceDoComando;

import analisador.Lexico;
import analisador.LexicalError;
import analisador.Token;

/**
 * RESPONSÁVEL: Gustavo
 *
 * Ações de compilar e equipe (itens 14 e 15 do PDF).
 *
 * O botão "compilar" executa a análise léxica (parte 2) sobre o conteúdo do
 * editor. Os tokens só são exibidos quando o programa inteiro é analisado sem
 * erro; se ocorrer um erro léxico, a área de mensagens mostra apenas o erro.
 */
public class AcoesCompilador {

    private Editor editor;
    private AreaMenssagem areaMensagem;

    public AcoesCompilador(Editor editor, AreaMenssagem areaMensagem) {
        this.editor = editor;
        this.areaMensagem = areaMensagem;
    }

    /** Botão "compilar" [F7] — item 14. */
    public void compilar() {
        String texto = editor.getConteudo();

        Lexico lexico = new Lexico();
        lexico.setInput(texto);

        // A listagem é montada aqui e só vai para a tela no final: assim, se um
        // erro acontecer no meio do programa, nenhum token chega a ser exibido.
        StringBuilder tokens = new StringBuilder();

        try {
            Token t;
            while ((t = lexico.nextToken()) != null) {
                tokens.append(String.format("%-8d %-22s %s%n",
                        linhaDaPosicao(texto, t.getPosition()),
                        ClassesDeToken.nome(t.getId()),
                        t.getLexeme()));
            }
        } catch (LexicalError e) {
            // Descarta tudo o que já tinha sido montado e mostra só o erro.
            areaMensagem.mostrarMensagem(mensagemDeErro(e, texto));
            return;
        }

        StringBuilder saida = new StringBuilder();

        // O cabeçalho só faz sentido quando existe pelo menos um token
        // (editor vazio ou só com comentários não gera nenhum).
        if (tokens.length() > 0) {
            saida.append(String.format("%-8s %-22s %s%n", "linha", "classe", "lexema"));
            saida.append(tokens);
            saida.append('\n');
        }

        saida.append("programa compilado com sucesso");
        areaMensagem.mostrarMensagem(saida.toString());
    }

    /** Botão "equipe" [F1] — item 15. */
    public void equipe() {
        areaMensagem.mostrarMensagem(
                "Amanda Eyng\n"
                + "Kaique Cunha Mori\n"
                + "Gustavo Henrique Luiz");
    }

    /**
     * Converte a posição absoluta no texto (que é o que Token e LexicalError
     * devolvem) no número da linha correspondente, começando em 1 — igual à
     * numeração que o NumberedBorder desenha no editor.
     */
    private int linhaDaPosicao(String texto, int posicao) {
        int linha = 1;
        int limite = Math.min(posicao, texto.length());

        for (int i = 0; i < limite; i++) {
            if (texto.charAt(i) == '\n') {
                linha++;
            }
        }
        return linha;
    }

    /**
     * Traduz o erro do GALS para o formato "linha N: descrição".
     *
     * e.getMessage() devolve o texto cru de SCANNER_ERROR (ScannerConstants.java);
     * cada um desses textos é convertido abaixo na mensagem pedida no enunciado.
     */
    private String mensagemDeErro(LexicalError e, String texto) {
        int linha = linhaDaPosicao(texto, e.getPosition());
        String erroGals = e.getMessage();
        String descricao;

        if ("Caractere não esperado".equals(erroGals)) {
            descricao = caractereEm(texto, e.getPosition()) + " caractere inválido";

        } else if ("Erro identificando palavra_string".equals(erroGals)) {
            descricao = "constante_string não fechada";

        } else if ("Erro identificando <ignorar>".equals(erroGals)) {
            descricao = "comentário não fechado";

        } else if ("Erro identificando float".equals(erroGals)) {
            descricao = "constante_float inválida";

        } else if ("Erro identificando palavra_reservada".equals(erroGals)
                || "Erro identificando bool".equals(erroGals)
                || "Erro identificando int".equals(erroGals)
                || "Erro identificando string".equals(erroGals)
                || "Erro identificando numero_float".equals(erroGals)) {
            descricao = "identificador inválido";

        } else {
            // Qualquer mensagem nova que o GALS venha a gerar aparece como veio.
            descricao = erroGals;
        }

        return "linha " + linha + ": " + descricao;
    }

    /** Devolve o caractere que causou o erro, para compor a mensagem. */
    private String caractereEm(String texto, int posicao) {
        if (posicao < 0 || posicao >= texto.length()) {
            return "fim de arquivo";
        }
        return String.valueOf(texto.charAt(posicao));
    }
}
