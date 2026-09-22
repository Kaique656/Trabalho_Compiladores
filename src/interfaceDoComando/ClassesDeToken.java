package interfaceDoComando;

import analisador.Constants;

/**
 * RESPONSÁVEL: Gustavo
 *
 * Traduz o id numérico de um token (Constants.java, gerado pelo GALS) para o
 * nome da classe por extenso, conforme pedido no enunciado da parte 2
 * (t.getId() sozinho não basta, é necessário "apresentar a classe por
 * extenso").
 */
public class ClassesDeToken {

    /** Devolve o nome por extenso da classe correspondente ao id do token. */
    public static String nome(int id) {
        switch (id) {
            // palavras reservadas
            case Constants.t_palavra_reservada: return "palavra reservada";
            case Constants.t_and:               return "palavra reservada (and)";
            case Constants.t_false:             return "palavra reservada (false)";
            case Constants.t_if:                return "palavra reservada (if)";
            case Constants.t_in:                return "palavra reservada (in)";
            case Constants.t_isfalsedo:         return "palavra reservada (isFalseDo)";
            case Constants.t_istruedo:          return "palavra reservada (isTrueDo)";
            case Constants.t_module:            return "palavra reservada (module)";
            case Constants.t_not:               return "palavra reservada (not)";
            case Constants.t_or:                return "palavra reservada (or)";
            case Constants.t_out:               return "palavra reservada (out)";
            case Constants.t_true:              return "palavra reservada (true)";
            case Constants.t_while:             return "palavra reservada (while)";

            // símbolos especiais
            case Constants.t_TOKEN_15: return "símbolo especial (+)";
            case Constants.t_TOKEN_16: return "símbolo especial (-)";
            case Constants.t_TOKEN_17: return "símbolo especial (*)";
            case Constants.t_TOKEN_18: return "símbolo especial (/)";
            case Constants.t_TOKEN_19: return "símbolo especial (()";
            case Constants.t_TOKEN_20: return "símbolo especial ())";
            case Constants.t_TOKEN_21: return "símbolo especial ([)";
            case Constants.t_TOKEN_22: return "símbolo especial (])";
            case Constants.t_TOKEN_23: return "símbolo especial (,)";
            case Constants.t_TOKEN_24: return "símbolo especial (:)";
            case Constants.t_TOKEN_25: return "símbolo especial (;)";
            case Constants.t_TOKEN_26: return "símbolo especial (<-)";
            case Constants.t_TOKEN_27: return "símbolo especial (=)";
            case Constants.t_TOKEN_28: return "símbolo especial (<>)";
            case Constants.t_TOKEN_29: return "símbolo especial (<)";
            case Constants.t_TOKEN_30: return "símbolo especial (>)";

            // identificadores
            case Constants.t_int:          return "identificador de int";
            case Constants.t_numero_float: return "identificador de float";
            case Constants.t_string:       return "identificador de string";
            case Constants.t_bool:         return "identificador de bool";

            // constantes
            case Constants.t_cint:           return "constante_int";
            case Constants.t_float:          return "constante_float";
            case Constants.t_palavra_string: return "constante_string";

            default: return "desconhecido (" + id + ")";
        }
    }
}