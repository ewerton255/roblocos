package br.com.roblocos.enums;

import br.com.roblocos.model.movimentosrobo.*;

public enum EnumAcao {
    ACENDER_LED_VERMELHO("Piscar Led Vermelho!", new AcenderLedVermelho()),
    ACENDER_LED_VERDE("Piscar Led Verde!", new AcenderLedVerde()),
    ACENDER_LED_AMARELHO("Piscar Led Amarelo!", new AcenderLedAmarelo()),
    ACENDER_LED_AZUL("Piscar Led Azul!", new AcenderLedAzul());

    private String descricao;
    private Acao entity;

    EnumAcao(String descricao, Acao entity) {
        this.descricao = descricao;
        this.entity = entity;
    }

    public String getDescricao() {
        return descricao;
    }

    public Acao getEntity() {
        return entity;
    }
}
