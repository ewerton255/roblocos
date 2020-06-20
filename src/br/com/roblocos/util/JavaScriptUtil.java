package br.com.roblocos.util;

import org.primefaces.PrimeFaces;

public class JavaScriptUtil {

    public static void executarEstruturaIf(String nameClass) {
        PrimeFaces.current().executeScript("executarIf('" + nameClass + "');");
    }

    public static void executarEstruturaWhile(String nameClass) {
        PrimeFaces.current().executeScript("executarWhile('" + nameClass + "');");
    }

    public static void pararExecucaoEstruturas() {
        PrimeFaces.current().executeScript("paraExecucaoWhile();");
    }
}
