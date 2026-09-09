package interfaceDoComando;

/**
 * RESPONSÁVEL: Gustavo
 *
 * Tradução do identificador numérico do token (Constants.java, gerado pelo
 * GALS) para a classe por extenso que deve aparecer na área de mensagens.
 *
 * O índice do vetor é exatamente o valor da constante: NOMES[35] corresponde
 * a t_cint = 35. Se o enunciado pedir outro texto para alguma classe, basta
 * trocar a string da linha correspondente.
 */
public class ClassesDeToken {

    private static final String[] NOMES = {
        "epsilon",              //  0 EPSILON      (não é gerado pelo léxico)
        "fim de arquivo",       //  1 DOLLAR       (não é gerado pelo léxico)
        "palavra reservada",    //  2 t_palavra_reservada
        "palavra reservada",    //  3 and
        "palavra reservada",    //  4 isFalsedo
        "palavra reservada",    //  5 false
        "palavra reservada",    //  6 if
        "palavra reservada",    //  7 in
        "palavra reservada",    //  8 isTrueDo
        "palavra reservada",    //  9 module
        "palavra reservada",    // 10 not
        "palavra reservada",    // 11 or
        "palavra reservada",    // 12 out
        "palavra reservada",    // 13 true
        "palavra reservada",    // 14 while
        "símbolo especial",     // 15 "+"
        "símbolo especial",     // 16 "-"
        "símbolo especial",     // 17 "*"
        "símbolo especial",     // 18 "/"
        "símbolo especial",     // 19 "("
        "símbolo especial",     // 20 ")"
        "símbolo especial",     // 21 "["
        "símbolo especial",     // 22 "]"
        "símbolo especial",     // 23 ","
        "símbolo especial",     // 24 ":"
        "símbolo especial",     // 25 ";"
        "símbolo especial",     // 26 "<-"
        "símbolo especial",     // 27 "="
        "símbolo especial",     // 28 "<>"
        "símbolo especial",     // 29 "<"
        "símbolo especial",     // 30 ">"
        "identificador int",    // 31 t_int            (i_Nome)
        "identificador float",  // 32 t_numero_float   (t_Nome)
        "identificador string", // 33 t_string         (s_Nome)
        "identificador bool",   // 34 t_bool           (b_Nome)
        "constante int",        // 35 t_cint           (123)
        "constante float",      // 36 t_float          (123,45)
        "constante string"      // 37 t_palavra_string ("texto")
    };

    /** Devolve a classe por extenso; nunca lança exceção. */
    public static String nome(int id) {
        if (id < 0 || id >= NOMES.length) {
            return "classe desconhecida (" + id + ")";
        }
        return NOMES[id];
    }
}
