package br.com.roblocos.model.logicasmatematicas;

public class Menor implements LogicaMatematica {

    @Override
    public boolean getAtendeCondicao(String argumento, String condicao) {
        try {
            return Integer.parseInt(String.valueOf(argumento)) < Integer.parseInt(condicao);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public LogicaMatematica clone() {
        return new Menor();
    }
}
