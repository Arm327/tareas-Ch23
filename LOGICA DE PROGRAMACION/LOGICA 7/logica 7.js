const diasSemana = ['lunes', 'martes', 'miércoles', 'jueves', 'viernes'];


const diaUsuario = prompt('Introduce un día de la semana (lunes a viernes):');
const horaUsuario = prompt('Introduce la hora (en formato HH:MM):');


const horaMinutos = horaUsuario.split(':');
const hora = parseInt(horaMinutos[0]);
const minutos = parseInt(horaMinutos[1]);
const minutosUsuario = hora * 60 + minutos;


const minutosFinSemana = 45 * 60 + 0; 
const diaFinSemana = 4; 
const minutosDiaFinSemana = diaFinSemana * 24 * 60 + 15 * 60; 

const diaUsuarioIndex = diasSemana.indexOf(diaUsuario.toLowerCase());
const minutosDiaUsuario = diaUsuarioIndex * 24 * 60 + minutosUsuario;

let minutosFaltantes;

if (diaUsuarioIndex === -1) {
  console.log('Día inválido');
} else if (diaUsuarioIndex === 4 && minutosUsuario >= 15 * 60) {
  console.log('Ya es fin de semana');
} else {
  minutosFaltantes = minutosDiaFinSemana - minutosDiaUsuario;
  console.log(`Faltan ${minutosFaltantes} minutos para el fin de semana`);
}