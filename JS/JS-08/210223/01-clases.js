
class persona {

    constructor(nombre, apellido) {
        this._nombre = nombre;
        this.apellido = apellido;
    }
    set nombre(nombre) {
        this._nombre = nombre;
    }

    get nombre() {
        return this._nombre;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
    get apellido (){
        return this._apellido;
    }
    nombrecompleto(){
        return this._nombre + "" + this._apellido;
    }
    nombrecompleto2(){
        return super.nombrecompleto2() + " " + this.departamento;
    }
//sobreescribir el metodo de la clase padre Object
    toString(){
        return this.nombrecompleto();
    }

}


let persona3 = new persona ("Jhonny", "Deep");
persona3.nombre = "Juan";
console.log(persona3.nombre);

persona3.apellido = "Jimenez";
console.log(persona3.apellido);

let persona1 = new persona("Juan", "Perez");
console.log(persona1.nombre);
console.log(persona1.apellido)
let persona2 = new persona("Maria", "Jimenez");
console.log(persona2);

class empleado extends persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido)
        this._departamento =departamento;
    }
    set departamento (departamento){
        this._departamento=this.departamento;
    }
    get departamento(){
        return this._departamento
    }
}
   //sobreescritura
let persona5 = new persona("arutro", "chavez");
console.log(persona5.toString());

let empleado1 = new empleado("Maria", "Perez", "Sistemas");

console.log(empleado1);
console.log(empleado1.nombrecompleto());





// let persona3 = new Persona('Jhonny', 'Deep');
// persona3.nombre = 'Juan';
// console.log(persona3.nombre);

// persona3.apellido = 'Jimenez';
// console.log(persona3.apellido);



// let persona1 = new Persona('Juan', 'Perez');
// console.log(persona1.nombre);
// console.log(persona1.apellido);
// let persona2 = new Persona('Maria', 'Jimenez');
// console.log(persona2);