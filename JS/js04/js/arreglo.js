let lista = [12,5,80,34];

let lnueva = lista.map(
function(valor){
    return valor * 2
}
);
console.log(lnueva);




lista.sort(
    function(a, b){
        return b - a;

    }

    );
console.log(lista);