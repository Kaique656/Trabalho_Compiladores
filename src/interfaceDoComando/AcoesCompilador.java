package interfaceDoComando;

/**
 * RESPONSÁVEL: Gustavo
 *
 * Ações de compilar e equipe (itens 14 e 15 do PDF).
 */
public class AcoesCompilador {

    private AreaMenssagem areaMensagem;

    public AcoesCompilador(AreaMenssagem areaMensagem) {
        this.areaMensagem = areaMensagem;
    }

    /** Botão "compilar" [F7] — item 14. */
    public void compilar() {
        // mostrarMensagem usa setText, então a mensagem anterior é substituída
        areaMensagem.mostrarMensagem("compilação de programas ainda não foi implementada");
    }

    /** Botão "equipe" [F1] — item 15. */
    public void equipe() {
        areaMensagem.mostrarMensagem(
                "Amanda Eyng\n"
                + "Kaique Cunha Mori\n"
                + "Gustavo Henrique Luiz");
    }
}
