
const numeroSecreto = Math.floor(Math.random() * 100) + 1;


let intentos = 0;
let adivinanza;

do {
  adivinanza = parseInt(prompt("Adivina el número secreto (entre 1 y 100):"));
  intentos++;

  if (adivinanza === numeroSecreto) {
    console.log(`¡Felicidades, adivinaste el número en ${intentos} intentos!`);
  } else {
    console.log("Ups, el número secreto es incorrecto. Vuelve a intentarlo.");
  }
} while (adivinanza !== numeroSecreto);