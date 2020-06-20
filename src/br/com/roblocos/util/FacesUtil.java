package br.com.roblocos.util;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.primefaces.PrimeFaces;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.io.IOException;
import java.util.Map;

import static javax.faces.application.FacesMessage.SEVERITY_ERROR;

public class FacesUtil {

    public static FacesContext getFacesContext() {
        return FacesContext.getCurrentInstance();
    }

    public static ExternalContext getExternalContext(FacesContext facesContext) {
        return facesContext.getExternalContext();
    }

    public static ServletContext getServleContext() {
        return (ServletContext) getFacesContext().getExternalContext().getContext();
    }

    public static Map<String, Object> getSessionMap() {
        return FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
    }

    public static void exibirMensagemDeErro(String mensagem) {
        exibirMensagem(SEVERITY_ERROR, mensagem, "Erro");
    }

    public static void exibirMensagemDeErro(Exception e) {
        exibirMensagem(SEVERITY_ERROR, ExceptionUtils.getRootCauseMessage(e), "Erro");
    }

    public static void abrirDialog(String dialog) {
        PrimeFaces.current().executeScript("PF('" + dialog + "').show();");
    }

    public static void fecharDialog(String dialog) {
        PrimeFaces.current().executeScript("PF('" + dialog + "').hide();");
    }

    public static void exibirMensagem(FacesMessage.Severity tipo, String mensagem, String detalhe) {
        FacesMessage msg = new FacesMessage(tipo, mensagem, detalhe);
        getFacesContext().addMessage(null, msg);
    }

    public static void redirecionar(String nomePagina) {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect(nomePagina);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void executarComando(String comando) {
        PrimeFaces.current().executeScript(comando);
    }
}
