/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model_lucas.enumeradores;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author vovostudio
 */
public enum EnumConstantes {
    SeparadorSplit(";"),
    SeparadorComboBox("-");

    private String constante;

    /**
     * Guarda as relacoes entre o tipo e o valor de um elemento da enum
     *
     * FONTE:
     * https://www.guj.com.br/t/enum-obter-o-valor-do-atributo-do-enum-atraves-do-metodos/109311/2
     */
    private static Map<String, EnumConstantes> relations;

    /**
     * Bloco estatico que popula o hashmap com as relacoes entre tipo e elementos da enum
     */
    static {
        relations = new HashMap<String, EnumConstantes>();
        for (EnumConstantes cons : values()) {
            relations.put(cons.getConstante(), cons);
        }
    }

    EnumConstantes(String constante) {
        this.constante = constante;
    }

    public String getConstante() {
        return constante;
    }

    public static EnumConstantes getConstante(String constante) {
        return relations.get(constante);
    }
}
