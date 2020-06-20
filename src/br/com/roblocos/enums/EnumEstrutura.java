package br.com.roblocos.enums;

import br.com.roblocos.model.estruturaslogicas.Estrutura;
import br.com.roblocos.model.estruturaslogicas.EstruturaIF;
import br.com.roblocos.model.estruturaslogicas.EstruturaWhile;

public enum EnumEstrutura {

    IF("IF", new EstruturaIF()),
    WHILE("While", new EstruturaWhile());

    private String descricao;
    private Estrutura entity;

    EnumEstrutura(String descricao, Estrutura entity) {
        this.descricao = descricao;
        this.entity = entity;
    }

    public String getDescricao() {
        return descricao;
    }

    public Estrutura getEntity() {
        return entity;
    }
}
