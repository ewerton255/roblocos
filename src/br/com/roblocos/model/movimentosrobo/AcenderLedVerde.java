package br.com.roblocos.model.movimentosrobo;

import br.com.roblocos.model.estruturaslogicas.Estrutura;
import br.com.roblocos.model.estruturaslogicas.EstruturaIF;
import br.com.roblocos.model.estruturaslogicas.EstruturaWhile;
import br.com.roblocos.util.JavaScriptUtil;

public class AcenderLedVerde implements Acao{

    @Override
    public void executarAcao(Estrutura estrutura) {
        if (estrutura instanceof EstruturaIF) {
            JavaScriptUtil.executarEstruturaIf("block-green");
        } else if (estrutura instanceof EstruturaWhile) {
            JavaScriptUtil.executarEstruturaWhile("block-green");
        }
    }
}
