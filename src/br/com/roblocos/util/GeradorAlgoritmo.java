package br.com.roblocos.util;

import br.com.roblocos.model.estruturaslogicas.Estrutura;
import br.com.roblocos.model.estruturaslogicas.EstruturaIF;
import br.com.roblocos.model.estruturaslogicas.EstruturaWhile;

import static br.com.roblocos.util.VerificadorUtil.estaNuloOuVazio;
import static br.com.roblocos.util.VerificadorUtil.naoEstaNuloOuVazio;

public class GeradorAlgoritmo {

    private static GeradorAlgoritmo instance;

    public static GeradorAlgoritmo getInstance() {
        if (instance == null) {
            return new GeradorAlgoritmo();
        }
        return instance;
    }

    public String obter(Estrutura estrutura) {
        return "<!DOCTYPE html>" +
                "<html xmlns='http://www.w3.org/1999/html'>" +
                "<head>" +
                "    <title>Page Title</title>" +
                "    <style>" +
                "        .estrutura {" +
                "            color: orange;" +
                "        }" +
                "" +
                "        .variavel {" +
                "            color: green;" +
                "        }" +
                "        .codigoInterno {" +
                "            color: gray;" +
                "        }" +
                "    </style>" +
                "</head>" +
                "<body>" +
                "<span class='estrutura'>" + obterNomeEstrutura(estrutura) + " </span>(<span class='variavel'>" + obterArgumento(estrutura) +
                "</span> " + obterLogica(estrutura) + " <span class=\"variavel\">" + obterCondicao(estrutura) + "</span>)" +
                " {" +
                "<br/>" +
                "<span class='codigoInterno'>" + obterCodigoAhExecutar(estrutura) + "</span>" +
                "<br/>" +
                "}" +
                "</body>" +
                "</html>";
    }

    private String obterNomeEstrutura(Estrutura estrutura) {
        if (estrutura instanceof EstruturaIF)
            return "if";
        if (estrutura instanceof EstruturaWhile)
            return "while";
        return null;
    }

    private String obterArgumento(Estrutura estrutura) {
        if (estaNuloOuVazio(estrutura) && estaNuloOuVazio(estrutura.getArgumento()))
            return "";
        return estrutura.getArgumento();
    }

    private String obterCondicao(Estrutura estrutura) {
        if (estaNuloOuVazio(estrutura) && estaNuloOuVazio(estrutura.getCondicao()))
            return "";
        return estrutura.getCondicao();
    }

    private String obterLogica(Estrutura estrutura) {
        if (naoEstaNuloOuVazio(estrutura) && naoEstaNuloOuVazio(estrutura.getLogicaMatematica()))
            return estrutura.getLogicaMatematica().getSimbolo();
        return "";
    }

    private String obterCodigoAhExecutar(Estrutura estrutura) {
        if (naoEstaNuloOuVazio(estrutura) && naoEstaNuloOuVazio(estrutura.getMovimentoRobo()))
            return "//" + estrutura.getMovimentoRobo().getDescricao();
        return "";
    }
}
