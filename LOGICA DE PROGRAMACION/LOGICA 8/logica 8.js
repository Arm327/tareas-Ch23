
let numeros = [];


for (let i = 0; i < 10; i++) {
  let numero = prompt(`Ingresa el número ${i + 1}:`);
  numeros.push(Number(numero)); 
}


function esPrimo(numero) {
  for (let i = 2; i < numero; i++) {
    if (numero % i === 0) {
      return false;
    }
  }
  return numero !== 1;
}


let primos = [];


for (let i = 0; i < numeros.length; i++) {
  if (esPrimo(numeros[i])) {
    primos.unshift(numeros[i]);
  } else {
    primos.push(numeros[i]);
  }
}


console.log("Array original:");
for (let i = 0; i < numeros.length; i++) {
  console.log(`[${i}] => ${numeros[i]}`);
}


console.log("Array con números primos al principio:");
for (let i = 0; i < primos.length; i++) {
  console.log(`[${i}] => ${primos[i]}`);
}