package br.com.roblocos.model.logicasmatematicas;

public interface LogicaMatematica {

    boolean getAtendeCondicao(String argumento, String condicao);

    LogicaMatematica clone();
}
