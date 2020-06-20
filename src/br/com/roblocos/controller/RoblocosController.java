package br.com.roblocos.controller;

import br.com.roblocos.enums.EnumAcao;
import br.com.roblocos.enums.EnumEstrutura;
import br.com.roblocos.enums.EnumLogicaMatematica;
import br.com.roblocos.model.estruturaslogicas.Estrutura;
import br.com.roblocos.model.estruturaslogicas.EstruturaIF;
import br.com.roblocos.model.estruturaslogicas.EstruturaWhile;
import org.primefaces.PrimeFaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.Arrays;
import java.util.List;

import static br.com.roblocos.util.FacesUtil.exibirMensagemDeErro;
import static br.com.roblocos.util.VerificadorUtil.estaNuloOuVazio;

@ManagedBean
@SessionScoped
public class RoblocosController {

    private EnumLogicaMatematica enumLogicaMatematica;
    private EnumAcao enumAcao;
    private EnumEstrutura enumEstrutura;
    private Estrutura estrutura;

    public RoblocosController() {
    }

    public List<EnumLogicaMatematica> getEnumLogicasMatematica() {
        return Arrays.asList(EnumLogicaMatematica.values());
    }

    public List<EnumAcao> getEnumMovimentosRobo() {
        return Arrays.asList(EnumAcao.values());
    }

    public List<EnumEstrutura> getEnumEstruturas() {
        return Arrays.asList(EnumEstrutura.values());
    }

    public String getToolTipButtonEstrutura(String name) {
        return "Clique para criar um bloco de '" + name + "'!";
    }

    public String getToolTipButtonCondicao(String name) {
        return "Clique para adicionar a condição '" + name + "' ao seu bloco!";
    }

    public String getToolTipoButtonMovimento(String name) {
        return "Clique para adicionar o movimento '" + name + "' ao seu bloco!";
    }

    public void selecionarEstrutura(EnumEstrutura enumEstrutura) {
        this.estrutura = enumEstrutura.getEntity().clone();

    }

    public void selecionarCondicao(EnumLogicaMatematica enumLogicaMatematica) {
        if (estaNuloOuVazio(estrutura)) {
            exibirMensagemDeErro("Para adicionar uma condição, é necessário criar uma estrutura!");
        } else {
            estrutura.logicaMatematica(enumLogicaMatematica);
        }
    }

    public void selecionarAcao(EnumAcao enumAcao) {
        if (estaNuloOuVazio(estrutura)) {
            exibirMensagemDeErro("Para adicionar uma ação, é necessário criar uma estrutura!");
        } else {
            estrutura.movimentoRobo(enumAcao);
        }
    }

    public String obterNomeEstrutura() {
        if (estrutura instanceof EstruturaIF) {
            return "IF";
        } else if (estrutura instanceof EstruturaWhile) {
            return "While";
        }
        return "";
    }

    public String obterDescricaoArgumento() {
        if (estrutura instanceof EstruturaIF) {
            return "Se";
        } else if (estrutura instanceof EstruturaWhile) {
            return "Enquanto";
        }
        return "";
    }

    public String obterDescricaoMovimento() {
        if (estrutura instanceof EstruturaIF) {
            return "Então";
        } else if (estrutura instanceof EstruturaWhile) {
            return "Faça";
        }
        return "";
    }

    public void executarJavaScriptScript() {
        PrimeFaces.current().executeScript("ativarBloco('block-red'); ativarBloco('block-yellow');");
    }

    public EnumLogicaMatematica getEnumLogicaMatematica() {
        return enumLogicaMatematica;
    }

    public void setEnumLogicaMatematica(EnumLogicaMatematica enumLogicaMatematica) {
        this.enumLogicaMatematica = enumLogicaMatematica;
    }

    public EnumAcao getEnumAcao() {
        return enumAcao;
    }

    public void setEnumAcao(EnumAcao enumAcao) {
        this.enumAcao = enumAcao;
    }

    public EnumEstrutura getEnumEstrutura() {
        return enumEstrutura;
    }

    public void setEnumEstrutura(EnumEstrutura enumEstrutura) {
        this.enumEstrutura = enumEstrutura;
    }

    public Estrutura getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(Estrutura estrutura) {
        this.estrutura = estrutura;
    }
}
