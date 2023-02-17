/*Como leer nodos de mi Document Object Model (DOM)


Metodos tradicionales (que se usan en versiones antiguas de JS)

    - document.getElementById (botonSuma)
    - document.getElementByTagName (<button>)
    - document.getElementByClassName (botones)





*/

/* var elementoID = document.getElementById("botonsuma");
console.log(elementoID);

var elementoetiqueta = document.getElementsByTagName("boton")
console.log(elementoetiqueta);
console.log("estes es el primer elemento de mi colección de botones", elementoEtiqueta[0]);


var elementoClassName = documento.getElementByClassName("botones");
console.log(elementoClassName);

/* 

metodos recientes 

-document.querySelector(.botones)
-document.querySelectorALL(.botones)


*/
/*
var unElemento = document.querySelector("#input1");
console.log(unElemento);

var unElemento = document.querySelectorALL(".botones");
console.log(variosElemento);
*/

const imagenperrito = document.createElement("img");

var input1 = document.getElementById("input1");
var input2 = document.getElementById("input2");


var botonsuma = document.getElementById("botonsuma");
var botonresta = document.getElementById("botonresta");
var botonmulti = document.getElementById("botonmulti");
var botondivision = document.getElementById("botondivision");

var resultado = document.getElementById("resultado");

/*var imagenperrito = document.createElement("img");

imagenperrito.src = "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenperrito.alt = "foto de perrito feliz"
imagenperrito.style.width = "90px";

var textoperrito = document.createElement("p");
textoperrito = "Este es mi perrito";

document.body.append(imagenperrito);

//Primer paso: Definir con que voy a interactuar (almaceno en una variable)
const textoAModificar = document.querySelector("#h1")

//Creo una funcion que cambia de color, segun el color que le paso como parametro
function cambiarColor(rojo){
    textoAModificar.style.color = azul;
}
*/


function suma(){
    let valor1 = parseInt(input1.value); //numero
    let valor2 = parseInt(input2.value); //numero
    let suma = valor1 + valor2; //calculo la suma
    resultado.innerHTML =suma; //pongo el resultado en su lugar

}

function resta(){
    let valor1 = parseInt(input1.value); 
    let valor2 = parseInt(input2.value); 
    let resta = valor1 - valor2; 
    resultado.innerHTML =resta;

}
 function multi(){
    let valor1 = parseInt(input1.value); 
    let valor2 = parseInt(input2.value); 
    let multi = valor1 * valor2; 
    resultado.innerHTML =multi;

 }
 function division(){
    let valor1 = parseInt(input1.value); 
    let valor2 = parseInt(input2.value); 
    let division = valor1 - valor2; 
    resultado.innerHTML =division;
 }

 /* como se crea un evento (addEventListener)
 -node.addEventListener ("evento a escuchar", lo que quiero que haga cuando se escuche)

 */

botonsuma.addEventListener("click", suma);

/*

Manipulacion del DOM


    - Metodos para acceder a elementos 

        - document.getElementById
        - document.getElementsByTagName
        - document.getElementosByClassName


    - Metodos para crear elementos  

        - document.createElement(etiqueta)
        - document.createTextNode(texto) - Investigar


    - Metodos para insertar elementos

        - parentElement.append
        - parentElement.insertBefore
        - parentElement.insertAdjacentElement


    - Metodos para modificar elementos

        - node.outerHTML (leer o referenciar el elemento)
        - node.innerHTML (modificar el elemento)


*/


