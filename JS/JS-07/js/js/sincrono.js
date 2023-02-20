// JavaScript Sincrono
alert("Obi-Wan: Anakin el canciller palpatine es malvado");
console.log("Anakin: desde mi punto de vista, los Jedi los son");
alert("Obi-Wan: Estas desorientado");
console.log("Obi-Wan: Te He fallado Anakin, te he fallado");
alert("Obi-Wan: se acabo Anakin, llevo la delantera");
console.log("Anakin: tu estas subestimando mi poder");
alert("Obi-Wan: no lo intentes");
console.log("Anakin: *dolor y Agonia");
alert("Obi Wan: TU ERAS EL ELEGIDO!, DEBIAS DESTRUIR A LOS SITH, NO UNIRTE A SU FUERZA, IBAS A DARLE EQUILIBRIO A LA FUERZA, NO DEJARLA EN LA OSCURIDAD");
setTimeout(

    function (){
        console.log("Obi-Wan: *Se va");
    }, 1000
)
console.log("Anakin: TE ODIO!!!!");

const myCollback = () => console.log("Obi-Wan: Eras mi hermano Anakin, yo te queria");
setTimeout(myCollback);

