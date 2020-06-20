package br.com.roblocos.model.estruturaslogicas;

public class EstruturaIF extends Estrutura {

    @Override
    public Estrutura clone() {
        return new EstruturaIF();
    }

    @Override
    public String getNome() {
        return "IF";
    }

    @Override
    public void executar() {
        if (logicaMatematica.getEntity().getAtendeCondicao(argumento, condicao)) {
            movimentoRobo.getEntity().executarAcao(this);
        }
    }
}
