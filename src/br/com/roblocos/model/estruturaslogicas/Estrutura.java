package br.com.roblocos.model.estruturaslogicas;

import br.com.roblocos.enums.EnumLogicaMatematica;
import br.com.roblocos.enums.EnumAcao;
import br.com.roblocos.util.GeradorAlgoritmo;
import br.com.roblocos.util.JavaScriptUtil;

public abstract class Estrutura {

    protected EnumLogicaMatematica logicaMatematica;
    protected String argumento;
    protected String condicao;
    protected EnumAcao movimentoRobo;

    public abstract void executar();

    public void interromper(){
        JavaScriptUtil.pararExecucaoEstruturas();
    };

    public abstract Estrutura clone();

    public abstract String getNome();

    public String getAlgoritmo() {
        return GeradorAlgoritmo.getInstance().obter(this);
    }

    public Estrutura logicaMatematica(EnumLogicaMatematica logicaMatematica) {
        this.logicaMatematica = logicaMatematica;
        return this;
    }

    public Estrutura argumento(String argumento) {
        this.argumento = argumento;
        return this;
    }

    public Estrutura condicao(String condicao) {
        this.condicao = condicao;
        return this;
    }

    public Estrutura movimentoRobo(EnumAcao movimentoRobo) {
        this.movimentoRobo = movimentoRobo;
        return this;
    }

    public EnumLogicaMatematica getLogicaMatematica() {
        return logicaMatematica;
    }

    public void setLogicaMatematica(EnumLogicaMatematica logicaMatematica) {
        this.logicaMatematica = logicaMatematica;
    }

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String argumento) {
        this.argumento = argumento;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public EnumAcao getMovimentoRobo() {
        return movimentoRobo;
    }

    public void setMovimentoRobo(EnumAcao movimentoRobo) {
        this.movimentoRobo = movimentoRobo;
    }
}
