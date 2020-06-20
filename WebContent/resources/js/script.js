$ = jQuery;

var interval = null;

function executarIf(nameClass) {
    ativarBloco(nameClass);
}

function executarWhile(nameClass) {
    interval = setInterval(function () {
        ativarBloco(nameClass);
    }, 900)
}

function paraExecucaoWhile() {
    clearInterval(interval);
}

function ativarBloco(nameClass) {

    var element = $('.' + nameClass);

    acender(element);

    setTimeout(function () {
        apagar(element)
    }, 400);

    setTimeout(function () {
        removerClasses(element)
    }, 800);
}

function acender(element) {
    element.addClass('acender');
}

function apagar(element) {
    element.addClass('apagar');
}

function removerClasses(element) {
    element.removeClass('acender');
    element.removeClass('apagar');
}
