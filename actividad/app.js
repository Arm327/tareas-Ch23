function rangoString(miString, myArray) {
    let miNuevoArray = [];
    
    for (let i = 0; i < myArray.length; i++) {
    
        if (miString.length < myArray[i].length) {
            miNuevoArray.push(myArray[i]);
        }
    }
    return miNuevoArray;
}

const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio','retina','urticaria','proscrito'];
console.log(rangoString("bocina", myArray));