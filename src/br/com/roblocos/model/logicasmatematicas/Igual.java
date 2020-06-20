package br.com.roblocos.model.logicasmatematicas;

public class Igual implements LogicaMatematica {

    @Override
    public boolean getAtendeCondicao(String argumento, String condicao) {
        return argumento.equals(condicao);
    }

    @Override
    public LogicaMatematica clone() {
        return new Igual();
    }
}
