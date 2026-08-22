package interfaceDoComando;

import javax.swing.*;
import javax.swing.text.DefaultEditorKit;

/**
 * RESPONSÁVEL: Gustavo
 *
 * Ações de edição de texto (item 13 do PDF): copiar, colar, recortar.
 * Comportamento igual aos editores de texto convencionais.
 */
public class AcoesEdicao {

    private Editor editor;

    public AcoesEdicao(Editor editor) {
        this.editor = editor;
    }

    /** Botão "copiar" [ctrl-c]. */
    public void copiar() {
        // TODO: editor.getTextArea().copy();
    }

    /** Botão "colar" [ctrl-v]. */
    public void colar() {
        // TODO: editor.getTextArea().paste();
    }

    /** Botão "recortar" [ctrl-x]. */
    public void recortar() {
        // TODO: editor.getTextArea().cut();
    }
}
