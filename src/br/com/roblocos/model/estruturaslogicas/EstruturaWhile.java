package br.com.roblocos.model.estruturaslogicas;

public class EstruturaWhile extends Estrutura {

    @Override
    public Estrutura clone() {
        return new EstruturaWhile();
    }

    @Override
    public String getNome() {
        return "While";
    }

    @Override
    public void executar() {
        if (logicaMatematica.getEntity().getAtendeCondicao(argumento, condicao)) {
            movimentoRobo.getEntity().executarAcao(this);
        }
    }
}
