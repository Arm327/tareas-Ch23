function suma() {
    let n1 = 8;
    let n2 = 6;
    let suma = (n1 + n2);
    console.log ("Este es el resultado: " + suma);
}
function resta(){
    let n1 = 8;
    let n2 = 6;
    let resta = (n1 - n2);
    console.log ("Este es el resultado: " + resta);
}
function mult() {
    let n1 = 8;
    let n2 = 6;
    let mult = (n1 * n2);
    console.log ("Este es el resultado: " + mult);
}
function div() {
    let n1 = 8;
    let n2 = 6;
    let div = (n1 / n2);
    console.log ("Este es el resultado: " + div);
}

/* anonimas */

let x = function (){
    let valor1 = 4;
    let valor2 = 5;
    let suma = (valor1 + valor2);
    console.log ("la funcion: " + suma);
}
let y = function (){
    let valor1 = 8;
    let valor2 = 6;
    let  y = (valor1 - valor2);
    console.log ("Este es el resultado: " + y);
}
let z = function (){
    let valor1 = 15;
    let valor2 = 21;
    let z = (valor1 * valor2);
    console.log ("Este es el resultado: " + z);
}
let divi = function (){
    let valor1 = 50;
    let valor2 = 2;
    let divi = (valor1 / valor2);
    console.log ("Este es el resultado: " + divi);
}
x();
y();
z();
divi();