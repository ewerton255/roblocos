package br.com.roblocos.enums;

import br.com.roblocos.model.logicasmatematicas.*;

public enum EnumLogicaMatematica {

    IGUAL("Igual", new Igual(), "=="),
    DIFERENTE("Diferente", new Diferente(), "!="),
    MAIOR("Maior", new Maior(), ">"),
    MENOR("Menor", new Menor(), "<"),
    MAIOR_IGUAL("Maior ou igual", new MaiorIgual(), ">="),
    MENOR_IGUAL("Menor ou igual", new MenorIgual(), "<=");

    private String descricao;
    private LogicaMatematica entity;
    private String simbolo;

    EnumLogicaMatematica(String descricao, LogicaMatematica entity, String simbolo) {
        this.descricao = descricao;
        this.entity = entity;
        this.simbolo = simbolo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LogicaMatematica getEntity() {
        return entity;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
