let miVariable = 34;
let miarreglo =  []; //declaracion literal
let miarreglo01 = new Array (); // por instancia
let miarreglo02 = [31,32,33,34]
console.log ("dato de miarreglo en el indice 0 - " + miarreglo02[0]);
console.log ("dato de miarreglo en el indice 1 - " + miarreglo02[1]);
console.log ("dato de miarreglo en el indice 2 - " + miarreglo02[2]);
console.log ("dato de miarreglo en el indice 3 - " + miarreglo02[3]);
console.log ("el tamaño o  numero de elementos del arreglo02 es: " + miarreglo02.length);

let miarreglo03 = ["hola", "que", "tal"];
console.log (miarreglo03 [0]);
console.log (miarreglo03 [1]);
console.log (miarreglo03 [2]);
console.log ("el tamaño o  numero de elementos del arreglo03 es: " + miarreglo03.length);

let miarreglo04 = [{nombre: "Héctor"}, {apellido: "Meneses"}, {edad: 21}];
console.log ("elemento del arreglo de tipo objeto miarreglo04 " + miarreglo04[0].nombre );
console.log ("elemento del arreglo de tipo objeto miarreglo04 " + miarreglo04[1].apellido);
console.log ("elemento del arreglo de tipo objeto miarreglo04 " + miarreglo04[2].edad );
console.log ("el tamaño o  numero de elementos del arreglo04 es: " + miarreglo04.length);

let nuevoarreglo00 = [3,6,1,4];
let otroarreglo = ["que", "hola", "tal", "como"];
console.log ("orden de mi arreglo nuevo con sort (): " + nuevoarreglo00.sort()); 
console.log ("orden de mi arreglo nuevo metodo pop (): " + nuevoarreglo00.pop()); 
console.log ("orden de mi arreglo nuevo metodo push (): " + nuevoarreglo00.push(10)); 
console.log ("orden de mi arreglo nuevo metodo reverse (): " + nuevoarreglo00.reverse()); 

console.log ("orden de mi arreglo nuevo con sort (): " + otroarreglo.sort()); 
console.log ("orden de mi arreglo nuevo metodo pop (): " + otroarreglo.pop()); 
console.log ("orden de mi arreglo nuevo metodo push (): " + otroarreglo.push("estas")); 
console.log ("orden de mi arreglo nuevo metodo reverse (): " + otroarreglo.reverse()); 

console.log ("javascript"[2]);
console.log ("javascript".length);

let matriz = [ [1,2,3], 
               [4,5,6], 
               [7,8,9] 
             ];
console.log ("longitud de matriz: " + matriz.length);
console.log (matriz [1][1])
console.log (matriz [2][1])
console.log (matriz [0][2])
